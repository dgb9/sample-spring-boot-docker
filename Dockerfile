FROM openjdk
RUN mkdir -p /apps/springboot
WORKDIR /apps/springboot
EXPOSE 8080
COPY ./target/starter.jar .
CMD ["java", "-jar", "starter.jar"]

