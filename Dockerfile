# Use the official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged jar file into the container at /app
COPY target/your-app-name.jar app.jar

# Expose port 8080
EXPOSE 8080

# Set the default command to run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
