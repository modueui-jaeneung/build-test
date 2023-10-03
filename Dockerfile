FROM openjdk:11.0.16-jdk

ARG JAR_FILE=./build/libs/ClientViewServer-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

