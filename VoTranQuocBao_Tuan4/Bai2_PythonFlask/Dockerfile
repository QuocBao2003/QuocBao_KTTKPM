# Sử dụng Python 3.9 làm base image
FROM python:3.9

# Đặt thư mục làm việc trong container
WORKDIR /app

# Copy toàn bộ file từ thư mục hiện tại vào thư mục /app trong container
COPY . /app

# Cài đặt các thư viện cần thiết
RUN pip install --no-cache-dir flask

# Mở cổng 5000
EXPOSE 5000

# Chạy ứng dụng Flask
CMD ["python", "app.py"]