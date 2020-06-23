package codegym.official_blog.controllers;

import codegym.official_blog.entities.Comment;
import codegym.official_blog.services.CommentServices;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentController {
    @Autowired
    CommentServices commentServices;
    @GetMapping("/view_comments")
    public ModelAndView view_comments(){
        return new ModelAndView("comments/list","comments", commentServices.showAllComments());
    }
    @GetMapping("/write_comment")
    public ModelAndView write_comment_form(){
        return new ModelAndView("comments/create","comment",new Comment());
    }
    @PostMapping("/write_comment")
    public ModelAndView save_comment(@ModelAttribute Comment comment){
        commentServices.addComment(comment);
        return new ModelAndView("comments/list","message","Comment saved!!!");
    }

}
