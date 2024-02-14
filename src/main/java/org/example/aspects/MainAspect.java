package org.example.aspects;

import org.example.aspects.model.Comment;
import org.example.aspects.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.util.logging.Logger;

public class MainAspect {
    private static Logger logger = Logger.getLogger(MainAspect.class.getName());
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext (CommentAspectConfig.class);
        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("text Comment");
        comment.setAuthor("Artem");

        String value = service.publishComment(comment);
        service.deleteComment(comment);
        logger.info(value);
    }
}
