package org.example.parrot;

import org.example.parrot.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    @Primary
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Coco");
        return p;
    }

    @Bean("parrots")
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Taki");
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer intTen(){
        return 10;
    }
}
