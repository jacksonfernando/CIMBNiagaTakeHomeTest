# Blog Post Applicaton
## Notes
- this project is run on jdk-17
- postman collection can be found on ./CIMBNiagaTakeHomeTest.postman_collection.json

## Command
### Using Docker
- use `docker build -t spring-boot-blog-post .` to build docker container
- use `docker run -p 8080:8080 spring-boot-blog-post` to run docker container
### Manual Run
- use `./gradlew bootRun` to run spring boot projects
- use `./gradlew test` to run all test
- use `./gradlew jaccocoTestReport` to generate test coverage

## Registration & Authentication flow
- After the service is running, register new user before using other endpoint
![image](https://github.com/jacksonfernando/CIMBNiagaTakeHomeTest/blob/master/images/authenticate.png)
- If you already have user registered, use authentication endpoint like below
![image](https://github.com/jacksonfernando/CIMBNiagaTakeHomeTest/blob/master/images/authenticate.png)
