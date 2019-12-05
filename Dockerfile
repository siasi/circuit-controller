FROM openjdk:8-jdk-alpine
ADD target/circuit-controller.jar circuit-controller.jar
ENTRYPOINT ["sh", "-c", "java -jar /circuit-controller.jar"]
