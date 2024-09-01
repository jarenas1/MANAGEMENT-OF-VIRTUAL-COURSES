package com.juan.RIWI_COURSES.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(info = @Info(contact = @Contact(name = "Andres, Santiago,Juan", url = "https://github.com/jarenas1/MANAGEMENT-OF-VIRTUAL-COURSES"), title = "Documentation: MANAGEMENT-OF-VIRTUAL-COURSES ", version = "1.0.0"))



public class Swagger {
}
