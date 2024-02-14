package org.example.comments.senders;

import org.example.comments.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailSendComment implements SendInterface{
    @Override
    public void send(Comment comment) {
        System.out.printf("send emeil to %s. Comment is : %s", comment.getName(), comment.getComment() );
    }
}
