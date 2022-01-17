package com.portfolio.portfolioAPI

import org.springframework.context.annotation.*
import springfox.documentation.builders.*
import springfox.documentation.service.*
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.util.*

@Configuration
@EnableSwagger2
class SpringFoxConfig {

    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build()
    }

    private fun getApiInfo(): ApiInfo = ApiInfo(
        "Portfolio API",
        "Portfolio app's backend.",
        "1.0",
        "",
        Contact(
            "Juan Pablo Moreno Londoño",
            "",
            "juanmoreno1308@gmail.com"
        ),
        "",
        "",
        Collections.emptyList()
    )
}