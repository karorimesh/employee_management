FROM amazoncorretto:17-alpine
VOLUME /tmp
RUN adduser -S jmix-user
USER jmix-user
COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
