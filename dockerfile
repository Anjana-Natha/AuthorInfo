FROM openjdk:17-oracle
COPY ./target/AuthorInfo-0.0.1-SNAPSHOT.jar AuthorInfo.jar
CMD ["java","-jar","AuthorInfo.jar"]