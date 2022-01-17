# Portfolio API

This repository holds the source code of the backend part of the Portfolio app. It allows an user to request information about a person's profile by their name, and to request their last five tweets by using the Twitter screen name obtained within the profile info in the first request's response.

## Prerequisites

+ Installation of Java 17
+ Environment variable Path set up pointing to Java 17's bin folder
+ Environment variable JAVA_HOME set up pointing to Java 17's location

## Configurations

The backend app requires special configurations for three components: The two data sources (a MySQL remote server and Twitter) and Swagger.
All these configurations can be reflected in the `application.properties` resource.

## Technologies used

+ spring-social-twitter: 1.1.2.RELEASE
+ spring-boot-starter-data-jpa
+ spring-boot-starter-web
+ jackson-module-kotlin
+ kotlin-reflect
+ kotlin-stdlib-jdk8
+ javax.persistence-api: 2.2
+ mysql-connector-java: 8.0.15
+ springfox-swagger2: 2.9.2
+ springfox-swagger-ui: 2.9.2
+ spring-boot-starter-test

## Steps to run

+ Open a terminal window.
+ Clone the project from the repository in GitHub.
+ Go to the project's root folder.
+ Run the `./gradlew bootRun` command.

Around 16 hours took the development of this project. 