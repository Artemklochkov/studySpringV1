package org.example.aspects;

import org.example.aspects.aspect.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = {"org.example.aspects.service"})
@EnableAspectJAutoProxy
public class CommentAspectConfig {

    @Bean
    LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
