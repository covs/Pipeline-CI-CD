🎯 Descripción del Proyecto

Este proyecto es una aplicación Spring Boot con un juego de adivinanza de números, donde los usuarios pueden interactuar a través de una API REST o una aplicación en consola.

Se ha configurado un pipeline CI/CD con GitHub Actions, que permite:

✅ Compilar y probar la aplicación automáticamente con Maven.

✅ Construir y subir la imagen Docker a Docker Hub.

✅ Generar releases en GitHub automáticamente con cada nueva versión (v1.0.0)

🚀 1️⃣ Pipeline CI/CD
Cada vez que se realiza un push o pull request en main, se ejecuta automáticamente un flujo de trabajo que:

🔹 Descarga el código y configura el entorno de ejecución.

🔹 Compila la aplicación y ejecuta las pruebas.

🔹 Construye una imagen Docker y la sube a Docker Hub.


📌 Cómo verificar el pipeline:


Ir a GitHub → Repositorio → Actions.

Buscar el workflow "CI/CD Pipeline".

Revisar los logs para asegurarse de que todos los pasos fueron exitosos.


📦 2️⃣ Generación Automática de Releases

Cada vez que se crea un tag (v1.0.0), se genera un release en GitHub, incluyendo el archivo JAR compilado.


📌 Cómo ver los releases en GitHub:

Ir a GitHub → Repositorio → Releases.

Seleccionar la versión deseada (v1.0.0, v1.0.1, etc.).

Descargar el archivo JAR para ejecutarlo localmente.

🎮 3️⃣ Cómo Jugar al Juego de Adivinanza

Cómo probar la API:

Iniciar la API con Spring Boot o Docker.

Acceder a la URL en el navegador:

http://localhost:8080/api/guess?number=5

Recibirás una respuesta indicando si el número es mayor, menor o correcto.

🐳 4️⃣ Cómo Ejecutar el Proyecto con Docker

📌 Construir la imagen Docker:

docker build -t tuusuario/demo-api .

📌 Ejecutar el contenedor

docker run -p 8080:8080 tuusuario/demo-api

📌 Probar la API en el navegador:

http://localhost:8080/api/guess?number=3

📌 5️⃣ Cómo Descargar el Último Release

📌 Desde GitHub Releases:

Ir a GitHub → Repositorio → Releases.

Seleccionar la versión más reciente.

Descargar el archivo JAR y ejecutarlo con:

java -jar demo-0.0.1-SNAPSHOT.jar
