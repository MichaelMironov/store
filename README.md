### Tech

- [Kotlin]
- [Spring Boot 3]
- [PostgreSQL]
- [Docker]
- [Gradle]

### Installation

_Below is an installing and setting up app._

1. Run database in docker
    ```sh
    docker run --name postgres -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=secret -e POSTGRES_DB=store -d postgres:15-alpine
    ```
2. Compile jar-file
   ```sh
   ./gradlew jar
   ```
3. Run application
   ```sh
   java -jar build/libs/store-0.0.1-SNAPSHOT.jar
   ```
Server port: 8081
### Api
Swagger available after launch on http://localhost:8081/swagger-ui/index.html