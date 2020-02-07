FROM adoptopenjdk/openjdk11
ARG JAR_FILE
VOLUME /tmp
RUN mkdir -p /opt/rapi-gateway
COPY build/libs/${JAR_FILE} /opt/rapi-gateway/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/rapi-gateway/app.jar"]
