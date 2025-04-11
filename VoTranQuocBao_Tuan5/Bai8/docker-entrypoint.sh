#!/bin/sh

# Wait for MySQL to be ready
until nc -z -v -w30 mysql 3306
do
  echo "Waiting for MySQL connection..."
  sleep 2
done

# Start the app
npm start