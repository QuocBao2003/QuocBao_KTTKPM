# Sử dụng image Python chính thức
FROM python:3.11

# Đặt thư mục làm việc
WORKDIR /app

# Copy requirements và cài thư viện
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy toàn bộ mã nguồn vào container
COPY . .

# Mở cổng Flask
EXPOSE 5000

# Lệnh chạy ứng dụng Flask
CMD ["python", "app.py"]