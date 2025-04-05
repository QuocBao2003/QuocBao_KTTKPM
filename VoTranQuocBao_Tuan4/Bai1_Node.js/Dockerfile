# Sử dụng Python 3.9 làm base image
FROM python:3.9

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy toàn bộ file trong thư mục hiện tại vào container
COPY . .

# Cài đặt Flask
RUN pip install flask

# Expose cổng 3000
EXPOSE 3000

# Chạy ứng dụng
CMD ["python", "app.py"]