FROM openjdk:17
COPY target/CropItem-0.0.1-SNAPSHOT.jar CropItem.jar
ENTRYPOINT ["java","-jar","CropItem.jar"]