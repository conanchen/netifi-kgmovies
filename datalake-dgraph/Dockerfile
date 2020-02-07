FROM adoptopenjdk/openjdk11
ARG JAR_FILE
VOLUME /tmp
RUN mkdir -p /opt/datalake-dgraph
COPY build/libs/${JAR_FILE} /opt/datalake-dgraph/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/datalake-dgraph/app.jar"]
