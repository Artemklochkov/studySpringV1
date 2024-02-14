package org.example.comments.resource;

import org.example.comments.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDTO implements CommentInterface{
    @Override
    public void saveComment(Comment comment) {
        System.out.println("Save comment: " + comment.getComment());
    }
}
