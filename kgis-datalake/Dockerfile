FROM adoptopenjdk/openjdk11
ARG JAR_FILE
VOLUME /tmp
RUN mkdir -p /opt/io.github.kgis-datalake
COPY build/libs/${JAR_FILE} /opt/io.github.kgis-datalake/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/io.github.kgis-datalake/app.jar"]
