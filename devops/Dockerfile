FROM debian:11

RUN apt update && apt install -y openjdk-17-jre

COPY projecttravel-0.0.1-SNAPSHOT.jar ./travelgroup.jar

CMD ["java", "-jar", "travelgroup.jar"]
