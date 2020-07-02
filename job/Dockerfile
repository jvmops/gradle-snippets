FROM adoptopenjdk:14-jre-openj9

# TODO: #workaround - get rid of it
# TODO: introduce private repository for this kind of thing
COPY "build/libs/job-1.0.0-SNAPSHOT.jar" /opt/job.jar

CMD ["java", "--enable-preview", "-jar", "/opt/job.jar"]
