package org.example.aspects.service;

import org.example.aspects.anotations.ToLog;
import org.example.aspects.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger  =
            Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publish comment: "+ comment.getText());
        return "SUCCESS";
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("delete comment: "+ comment.getText());
    }
}
