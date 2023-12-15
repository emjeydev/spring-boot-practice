package dev.emjey.challengesix.config;


// This file is made by EmJey
// Project: contacts
// FileName: OpenApiConfig.java
// Date: 2023/12/15
// Modified Date: 2023/12/15
// Email: emjeydev@gmail.com
// Github: emjeydev


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("Contact API By EmJeyDev")
                        .description("Contact API helps you to add and manage contacts")
                        .version("v1.0.1"));
    }

}
