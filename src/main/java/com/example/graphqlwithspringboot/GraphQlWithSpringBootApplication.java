package com.example.graphqlwithspringboot;

import com.example.graphqlwithspringboot.resolver.UserResolver;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.io.File;

@SpringBootApplication
public class GraphQlWithSpringBootApplication {


    public static void main(String[] args) {
        SpringApplication.run(GraphQlWithSpringBootApplication.class, args);
    }

}
