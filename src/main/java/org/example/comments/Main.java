package org.example.comments;

import org.example.comments.model.Comment;
import org.example.comments.service.CommentService;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(CommentConfigBean.class);

        Comment comment = new Comment();
        comment.setComment("this is new comment");
        comment.setName("Artem");

        CommentService service = context.getBean("service", CommentService.class);
        service.pushComment(comment);
    }
}
