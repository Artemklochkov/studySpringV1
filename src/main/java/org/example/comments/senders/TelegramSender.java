package org.example.comments.senders;

import org.example.comments.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("telegram")
public class TelegramSender implements SendInterface{
    @Override
    public void send(Comment comment) {
        System.out.printf("send to telegram.\n User - %s\n Message: %s",comment.getName(),comment.getComment());
    }
}
