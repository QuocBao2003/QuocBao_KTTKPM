require('dotenv').config();
const express = require('express');
const mysql = require('mysql2');

const app = express();
const port = 3000;

const connection = mysql.createConnection({
  host: process.env.DB_HOST,
  user: process.env.DB_USER,
  password: process.env.DB_PASSWORD,
  database: process.env.DB_NAME,
  port: process.env.DB_PORT
});

connection.connect(error => {
  if (error) {
    console.error('Database connection failed:', error.stack);
    return;
  }
  console.log('Connected to MySQL database.');
});

app.get('/', (req, res) => {
  connection.query('SELECT NOW() AS current_time', (err, results) => {
    if (err) {
      res.status(500).send('Database query failed');
    } else {
      res.send(`Current time from database: ${results[0].current_time}`);
    }
  });
});

app.listen(port, () => {
  console.log(`App running on port ${port}`);
});