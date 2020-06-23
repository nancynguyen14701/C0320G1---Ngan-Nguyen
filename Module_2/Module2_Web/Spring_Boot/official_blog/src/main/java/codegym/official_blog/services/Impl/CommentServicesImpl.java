package codegym.official_blog.services.Impl;

import codegym.official_blog.entities.Comment;
import codegym.official_blog.repositories.CommentRepository;
import codegym.official_blog.services.CommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class CommentServicesImpl implements CommentServices {
    @Autowired
    CommentRepository commentRepository;
    @Override
    public void addComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void editComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public List<Comment> showAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findCommentById(Long id) {
        return commentRepository.findById(id).orElse(null);
    }
}
