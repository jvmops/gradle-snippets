FROM adoptopenjdk:14-jre-openj9

# TODO: #workaround - get rid of it
# TODO: introduce private repository for this kind of thing
COPY "build/libs/hello-api-1.0.0-SNAPSHOT.jar" /opt/api.jar

# this way you can acces build args
ARG asd
RUN echo "$asd"

CMD ["java", "--enable-preview", "-jar", "/opt/api.jar"]
