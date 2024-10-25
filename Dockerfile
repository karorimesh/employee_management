FROM amazoncorretto:17-alpine
VOLUME /tmp
RUN adduser -S jmix-user
USER root
COPY build/libs/EmployeeManagement-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
