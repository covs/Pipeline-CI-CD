# Usar una imagen base de Java
# openjdk:11-jre-slim
FROM openjdk:17-jdk-slim
 
# Establecer el directorio de trabajo
WORKDIR /app
 
# Copiar el archivo JAR generado
COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
 
# Exponer el puerto 8080
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]



