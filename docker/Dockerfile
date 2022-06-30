FROM openjdk:13-alpine3.10

MAINTAINER Mike "test@test123456.com"

EXPOSE 5050

WORKDIR /usr/local/bin

COPY ./httpServer.jar httpServer.jar

CMD ["java", "-jar", "httpServer.jar"]