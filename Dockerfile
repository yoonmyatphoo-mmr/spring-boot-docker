FROM openjdk:17-jdk-alpine
EXPOSE 8080
COPY target/spring-boot-docker.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]