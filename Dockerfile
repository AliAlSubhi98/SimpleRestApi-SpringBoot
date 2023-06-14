FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY . /app

RUN apk add --no-cache maven

RUN mvn clean install

EXPOSE 8080

CMD ["java", "-jar","target/learn-spring-boot-0.0.1.jar"]



