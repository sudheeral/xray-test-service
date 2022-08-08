FROM openjdk:8-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java -Dserver.port=80","-jar","/app.jar"]
ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar --server.port=80