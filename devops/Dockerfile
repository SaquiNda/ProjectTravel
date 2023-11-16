FROM debian:11

RUN apt update && apt install -y openjdk-17-jre

COPY Proyecto-0.0.1-SNAPSHOT.jar ./grouptravel.jar

CMD ["java", "-jar", "grouptravel.jar"]
