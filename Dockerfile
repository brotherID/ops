FROM openjdk:17-alpine
RUN mkdir /opt/app
COPY /target/ops-0.0.1-SNAPSHOT.jar /opt/app
EXPOSE 9088
CMD ["java", "-jar", "/opt/app/ops-0.0.1-SNAPSHOT.jar"]