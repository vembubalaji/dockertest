FROM java:8
COPY target/demo-0.0.1-SNAPSHOT.jar /opt/lib/demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java"]
CMD ["-Dspring.profiles.active=docker", "-jar", "/opt/lib/demo-0.0.1-SNAPSHOT.jar"]