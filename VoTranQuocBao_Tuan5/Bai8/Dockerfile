# Base image
FROM node:18

# Install netcat (nc) để chờ MySQL container
RUN apt-get update && apt-get install -y netcat

# Set working directory
WORKDIR /usr/src/app

# Copy package.json and install dependencies
COPY package*.json ./
RUN npm install

# Copy app files
COPY . .

# Give permission to entrypoint script
RUN chmod +x docker-entrypoint.sh

# Run entrypoint script
ENTRYPOINT ["./docker-entrypoint.sh"]

# Expose port
EXPOSE 3000