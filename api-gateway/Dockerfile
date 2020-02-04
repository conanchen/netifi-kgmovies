FROM adoptopenjdk/openjdk11
ARG JAR_FILE
VOLUME /tmp
RUN mkdir -p /opt/api-gateway
COPY build/libs/${JAR_FILE} /opt/api-gateway/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/api-gateway/app.jar"]
