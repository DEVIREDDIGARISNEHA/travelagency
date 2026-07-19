FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY travelagency/ .

# Iddi line add chey
RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/*.jar"]
