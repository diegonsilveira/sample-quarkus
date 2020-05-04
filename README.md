# Application

Criar aplicação:

```
mvn io.quarkus:quarkus-maven-plugin:1.4.1.Final:create \
    -DprojectGroupId=br.com \
    -DprojectArtifactId=quickstart \
    -DclassName="br.com.test.Test" \
    -Dpath="/hello" \
    -Dextensions=""
```

Executar aplicação: `./mvnw compile quarkus:dev -Dquarkus.profile=dev`

Gerar pacotes: `./mvnw package`

Executar pacote: `java -jar getting-started-1.0-SNAPSHOT-runner.jar`

Gerar pacote nativo: `./mvnw clean package -Pnative`

Extensões adicionadas: `./mvnw quarkus:add-extension -Dextension="hibernate-orm, jdbc-postgres, resteasy-jsonb, jwt, spring-web, health, spring-data-jpa, quarkus-smallrye-openapi, quarkus-smallrye-opentracing, quarkus-flyway"`


# Endpoints

*http://localhost:8080/jedis* - Endpoint of Jedi using javax.ws.rs packages (GET, POST, DELETE);

*http://localhost:8080/movies* - Endpoint of movies using spring classes (GET, POST, DELETE);

*http://localhost:8080/secured* - Security endpoint of Movies using javax.ws.rs packages (GET);

*http://localhost:8080/health/live* - HealthCheck sample;

*http://localhost:8080/swagger-ui/* - Swagger UI

*http://localhost:8080/openapi/* - OpenApi

*http://localhost:8080/config/* - Spring Properties example

### Jaeger

Imagem:

```
docker run -p 5775:5775/udp -p 6831:6831/udp -p 6832:6832/udp -p 5778:5778 -p 16686:16686 -p 14268:14268 jaegertracing/all-in-one:latest
```

*http://localhost:16686/trace/* - Jaeger

# Links

https://docs.google.com/presentation/d/1a4eAzcFdxibWrlH3XUQD-UuHoMBafynV709ibsk1ijo/edit?usp=sharing
