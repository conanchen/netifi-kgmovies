FROM adoptopenjdk/openjdk11
ARG JAR_FILE
VOLUME /tmp
RUN mkdir -p /opt/gapi-gateway
COPY build/libs/${JAR_FILE} /opt/gapi-gateway/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/gapi-gateway/app.jar"]
