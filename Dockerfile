# Use the official OpenJDK base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /springbootapplication

# Copy the built jar file into the container
COPY build/libs/spring.boot.sample-0.0.1-SNAPSHOT.jar springbootapplication.jar

# Expose port 8080 (if your application runs on a specific port)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "springbootapplication.jar"]
