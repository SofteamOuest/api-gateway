FROM java:9-jdk

MAINTAINER mehdi.elkouhen@gmail.com

WORKDIR /apps/api-gateway

COPY build/libs/api-gateway.jar /apps/api-gateway/api-gateway.jar

EXPOSE 8080

CMD java -jar api-gateway.jar