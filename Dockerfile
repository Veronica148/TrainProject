FROM maven:3.6.3-jdk-8

RUN mkdir /docker
WORKDIR /docker
COPY . .

#RUN apt-get update
#RUN apt-get install -y unzip xvfb libxi6 libgconf-2-4
#RUN apt-get update && apt-get install -yq libgconf-2-4
#RUN apt-get install libnss3 libxi6 libgconf-2-4

#RUN mvn dependency:resolve
#WORKDIR /docker/src/test/resources/drivers/linux64

#CMD mv chromedriver /usr/bin/chromedriver
#CMD chown root:root /usr/bin/chromedriver
#CMD chmod +x /usr/bin/chromedriver
#CMD chmod +x chromedriver

#tests run section - run in container
#WORKDIR /docker
CMD mvn clean test