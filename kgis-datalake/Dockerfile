FROM adoptopenjdk/openjdk11
ARG JAR_FILE
VOLUME /tmp
RUN mkdir -p /opt/kgis-datalake
COPY build/libs/${JAR_FILE} /opt/kgis-datalake/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/kgis-datalake/app.jar"]
