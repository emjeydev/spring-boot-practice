package dev.emjey.challengeseven.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



// This file is made by EmJey
// Project: contacts
// FileName: OpenApiConfig.java
// Date: 2023/12/15
// Modified Date: 2023/12/15
// Email: emjeydev@gmail.com
// Github: emjeydev

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
            .title("Contact API")
            .description("An API that can manage contacts")
            .version("v1.0"));
    }
}