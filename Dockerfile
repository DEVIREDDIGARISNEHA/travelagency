FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY travelagency/pom.xml travelagency/
COPY travelagency/mvnw travelagency/
COPY travelagency/.mvn travelagency/.mvn
COPY travelagency/src travelagency/src

WORKDIR /app/travelagency

RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]
