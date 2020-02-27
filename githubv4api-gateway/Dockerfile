FROM adoptopenjdk/openjdk11
ARG JAR_FILE
VOLUME /tmp
RUN mkdir -p /opt/githubv4api-gateway
COPY build/libs/${JAR_FILE} /opt/githubv4api-gateway/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/githubv4api-gateway/app.jar"]
