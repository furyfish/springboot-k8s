FROM openjdk:8
EXPOSE 8080
ADD target/*.jar springbootk8sdemo.jar
ENTRYPOINT ["java","-jar","/springbootk8sdemo.jar"]