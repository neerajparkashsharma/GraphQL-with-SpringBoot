FROM openjdk:18-alpine
EXPOSE 8090
ADD target/graphql-springboot.jar graphql-springboot.jar
ENTRYPOINT ["java","-jar","/graphql-springboot.jar"]
