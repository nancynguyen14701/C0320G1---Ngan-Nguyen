package codegym.official_blog.services;

import codegym.official_blog.entities.Comment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public interface CommentServices {

    void addComment(Comment comment);

    void editComment(Comment comment);

    void deleteComment(Long id);

    List<Comment> showAllComments();

    Comment findCommentById(Long id);

}
