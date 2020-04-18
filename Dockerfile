FROM maven:3.6.3-jdk-8

RUN mkdir /docker

WORKDIR /docker

COPY pom.xml .
COPY TestNGSuiteConfig.xml .
RUN mvn dependency:resolve

COPY src .
#COPY testn.xml
#Container is listening on the specified port at runtime
EXPOSE 8080

RUN mvn clean test