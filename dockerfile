# Use a base image with Java installed
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY . /app
# RUN javac Sample.java

# Set the command to run when the container starts
CMD ["java", "Sample.java"]