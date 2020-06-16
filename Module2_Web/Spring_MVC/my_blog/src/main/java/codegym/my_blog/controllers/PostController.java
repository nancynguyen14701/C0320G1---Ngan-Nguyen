package codegym.my_blog.controllers;

import codegym.my_blog.models.Post;
import codegym.my_blog.services.PostService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/my_blog")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("")
    public ModelAndView getHomePage(){
        return new ModelAndView("home");
    }

    @GetMapping("/show_all")
    public ModelAndView showAll(){
    List<Post> blog= postService.showAllBlog();
    ModelAndView modelAndView= new ModelAndView("list");
    modelAndView.addObject("blogs", blog);
    return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createBlog(){
        return new ModelAndView("create","new_post", new Post());
    }
    @PostMapping("/create")
    public ModelAndView saveBlog(@ModelAttribute("new_post") Post new_post){
        postService.createBlog(new_post);
        ModelAndView modelAndView= new ModelAndView("create");
//        modelAndView.addObject("new_post", new Post());
        modelAndView.addObject("message", "New blog created successfully" );
        return modelAndView;
    }
    @GetMapping("/show_blog/{id}")
    public ModelAndView showBlog(@PathVariable Long id){
        return new ModelAndView("view", "blog", postService.viewBlogById(id));
    }


}
