package com.jtspringproject.JtSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages = "com.jtspringproject.JtSpringProject")
public class JtSpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtSpringProjectApplication.class, args);
    }

}
