# Determine the base image
# Start with Amazon Corretto JDK 21
FROM amazoncorretto:21.0.4

#Set the working directory
WORKDIR /app

#Copy any relevant source code or binaries
COPY target/*.jar app.jar

#Define the networking and exposing ports
EXPOSE 8080

#Define the startup command
ENTRYPOINT ["java", "-jar", "app.jar"]