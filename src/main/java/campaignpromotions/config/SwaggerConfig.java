package campaignpromotions.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/*Anotacion para la configuracion Swagger para la generacion de documentacion de la API REST
 *
 * HTML: http://localhost:8080/swagger-uri/
 * JSON: http://localhost:808/v2/api-docs
 */
@Configuration
public class SwaggerConfig {

    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiDetails() {
        return new ApiInfo("Spring Boot campaing API REST",
                "Library API REST document",
                "1.0",
                "http://www.google.com",
                new Contact("Daniel Calderon", "http://www.google.com", "daniel.calderon.e.v@gmail.com"),
                "MIT",
                "http://www.google.com",
                Collections.emptyList());
    }
}
