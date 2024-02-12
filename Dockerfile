FROM openjdk:17-jdk-slim-buster

WORKDIR /app

COPY build/libs/* build/lib/

COPY build/libs/spring-boot-docker-gradle-app-1.0.0.jar build/

WORKDIR /app/build

EXPOSE 8080

ENTRYPOINT java -jar spring-boot-docker-gradle-app-1.0.0.jar