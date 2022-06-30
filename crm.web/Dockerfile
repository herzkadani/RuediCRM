FROM openjdk:17-jdk-alpine3.14

MAINTAINER Dani Herzka "dani.herzka@bbzbl-it.ch"

EXPOSE 7070

WORKDIR /usr/local/bin

COPY ./target/crm.web-0.0.1-SNAPSHOT-shaded.jar crm.web-0.0.1-SNAPSHOT-shaded.jar

CMD ["java", "-jar", "crm.web-0.0.1-SNAPSHOT-shaded.jar"]