package org.example.comments;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.comments.resource","org.example.comments.senders","org.example.comments.service"})
public class CommentConfig {
}
