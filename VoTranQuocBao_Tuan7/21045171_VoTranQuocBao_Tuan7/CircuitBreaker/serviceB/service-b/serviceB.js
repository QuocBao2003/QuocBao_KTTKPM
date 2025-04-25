const express = require('express');
const axios = require('axios');
const CircuitBreaker = require('opossum');

const app = express();
const PORT = 8081;

let callCount = 0;
const MAX_CALLS = 5;

// Hàm gọi Service A
async function callServiceA() {
  const response = await axios.get('http://localhost:8080/api/v1/service-a/hello');
  return response.data;
}

// Circuit Breaker config
const options = {
  timeout: 3000,
  errorThresholdPercentage: 50,
  resetTimeout: 5000
};

const breaker = new CircuitBreaker(callServiceA, options);
breaker.fallback(() => 'Fallback: Service A is currently unavailable.');

// Route chính
app.get('/api/v1/service-b/forward', async (req, res) => {
  if (callCount >= MAX_CALLS) {
    return res.status(429).json({
      message: `Đã vượt quá số lần gọi cho phép (${MAX_CALLS} lần). Hãy thử lại sau.`
    });
  }

  try {
    const result = await breaker.fire();
    callCount++;
    res.json({
      fromServiceB: "Response from Service B",
      fromServiceA: result,
      callCount
    });
  } catch (error) {
    callCount++;
    res.status(500).json({
      fromServiceB: "Service B failed",
      error: error.message,
      callCount
    });
  }
});

app.listen(PORT, () => {
  console.log(`Service B is running on http://localhost:${PORT}`);
});