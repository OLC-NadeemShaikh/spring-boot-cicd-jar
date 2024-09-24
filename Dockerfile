FROM openjdk:17-alpine
EXPOSE 8080
ADD target/spring-boot-docker-jar.jar spring-boot-docker-jar.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker-jar.jar"]
