FROM openjdk:18
WORKDIR /
ADD target/movie-demo-0.0.1-SNAPSHOT.jar //
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/movie-demo-0.0.1-SNAPSHOT.jar"]