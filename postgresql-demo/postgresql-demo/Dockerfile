FROM ubuntu:latest
LABEL authors="joseph.adogeri"

FROM openjdk:24-jdk-slim
ARG JAR_FILE=postgresql-demo/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080