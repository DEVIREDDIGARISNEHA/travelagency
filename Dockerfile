FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Copy everything
COPY .

# Give permission and build
RUN chmod +x ./mvnw && ./mvnw clean package -DskipTests

# Find the jar and rename
RUN cp target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
