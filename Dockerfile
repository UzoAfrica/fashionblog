FROM openjdk:11
EXPOSE 8082
ADD target/fashionblog-images.jar fashionblog-images.jar
ENTRYPOINT ["java", "-jar", "/fashionblog-images.jar"]