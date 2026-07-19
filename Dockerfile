FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY travelagency/ .
WORKDIR /app
RUN ./mvnw -f travelagency/pom.xml clean package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "travelagency/target/*.jar"]
