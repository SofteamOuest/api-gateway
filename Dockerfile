FROM java:8

MAINTAINER mehdi.elkouhen@softeam.fr

WORKDIR /apps/api-gateway

COPY build/libs/api-gateway.jar /apps/api-gateway/api-gateway.jar

EXPOSE 8080

CMD java -jar api-gateway.jar