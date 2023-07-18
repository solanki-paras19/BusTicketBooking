FROM openjdk:17
COPY targets/*.jar ticketbooking.jar
EXPOSE 8082
ENTRYPOINT [ "java","-jar","ticketbooking.jar" ]