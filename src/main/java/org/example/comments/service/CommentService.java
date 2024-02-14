package org.example.comments.service;

import org.example.comments.model.Comment;
import org.example.comments.resource.CommentInterface;
import org.example.comments.senders.SendInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    CommentInterface commentInterface;
    SendInterface sendInterface;

    public CommentService(CommentInterface commentInterface, @Qualifier("telegram") SendInterface sendInterface) {
        this.commentInterface = commentInterface;
        this.sendInterface = sendInterface;
    }

    public void pushComment(Comment comment) {
        commentInterface.saveComment(comment);
        sendInterface.send(comment);
    }
}
