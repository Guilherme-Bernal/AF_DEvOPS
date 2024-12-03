# Usar uma imagem base
FROM openjdk:17-jdk-slim

# Configurar diretório de trabalho
WORKDIR /app

# Copiar o JAR do projeto
COPY target/clean-architecture-app.jar app.jar

# Comando para iniciar a aplicação
CMD ["java", "-jar", "app.jar"]
