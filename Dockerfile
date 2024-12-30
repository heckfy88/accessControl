FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file to the container
COPY target/productservice-0.1.jar app.jar

# Expose the service port
EXPOSE 9091

# Run the application
CMD ["java", "-jar", "app.jar"]