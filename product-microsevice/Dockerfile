# Specify the base image
FROM openjdk:20-jdk-slim

# Set the work dir
WORKDIR /usr/app

# Install some dependencies
#RUN apt-get update && apt-get install -y maven

# copy the required files
COPY ./target/product-microsevice-0.0.1-SNAPSHOT.jar ./

EXPOSE 8084

# Run the required commands
CMD ["java", "-jar", "product-microsevice-0.0.1-SNAPSHOT.jar"]
