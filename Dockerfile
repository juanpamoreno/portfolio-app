FROM gradle:alpine as build
WORKDIR /app
COPY . .
#RUN ./gradlew build
EXPOSE 8080
CMD ["./gradlew", "bootRun"]
#FROM