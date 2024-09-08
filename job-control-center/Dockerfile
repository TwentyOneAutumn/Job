FROM openjdk:8-jdk-alpine3.9

RUN mkdir -p /jar

WORKDIR /jar

COPY job-control-center-1.0.jar job-control-center-1.0.jar

ENTRYPOINT ["java","-jar","job-control-center-1.0.jar"]