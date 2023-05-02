FROM openjdk:11-jre-slim
COPY target/my-beer-service-1.0.0.jar /usr/src/beer-service/
WORKDIR /usr/src/beer-service
EXPOSE 8080
CMD ["java", "-jar", "my-beer-service-1.0.0.jar"]
