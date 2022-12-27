FROM openjdk:11
EXPOSE 8081
LABEL maintainer="chandanmishra"
ADD target/devops-app.jar devops-app.jar
ENTRYPOINT ["java","-jar","devops-app.jar"]

