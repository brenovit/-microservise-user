#!/bin/bash

./mvnw clean package

docker build -t courses/user-service:1.0 .

docker stop user-service 
docker rm user-service

docker run -d -p 8082:8082 --name user-service courses/user-service:1.0