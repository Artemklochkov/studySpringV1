package org.example.comments;

import org.example.comments.resource.CommentDTO;
import org.example.comments.resource.CommentInterface;
import org.example.comments.senders.EmailSendComment;
import org.example.comments.senders.SendInterface;
import org.example.comments.senders.TelegramSender;
import org.example.comments.service.CommentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommentConfigBean {
    @Bean
    CommentInterface commentInterface(){
        return new CommentDTO();
    }

    @Bean("telega")
    SendInterface sendInterface() {
        return new TelegramSender();
    }

    @Bean
    SendInterface sendInterface1() {
        return new EmailSendComment();
    }

    @Bean
    CommentService service(CommentInterface commentInterface, @Qualifier("telega") SendInterface sendInterface){
        return new CommentService(commentInterface,sendInterface);
    }

}
