# 1️⃣ Image Java légère
FROM eclipse-temurin:17-jdk-alpine

# 2️⃣ Dossier de travail dans le container
WORKDIR /app

# 3️⃣ Copier le JAR généré par Maven
COPY target/*.jar app.jar

# 4️⃣ Commande de démarrage
ENTRYPOINT ["java", "-jar", "app.jar"]
