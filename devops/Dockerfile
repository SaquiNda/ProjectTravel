# Usa una imagen base con Java 17
FROM openjdk:17-jre

# Copia el archivo JAR de la aplicación a la imagen
COPY Proyecto-0.0.1-SNAPSHOT.jar ./grouptravel.jar

# Expone el puerto en el que la aplicación se ejecutará
EXPOSE 8081

# Comando para ejecutar la aplicación al iniciar el contenedor
CMD ["java", "-jar", "/grouptravel.jar"]
