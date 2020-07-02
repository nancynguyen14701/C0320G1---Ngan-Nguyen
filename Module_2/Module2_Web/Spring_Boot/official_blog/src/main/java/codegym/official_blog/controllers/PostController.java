package codegym.official_blog.controllers;

import codegym.official_blog.entities.Post;
import codegym.official_blog.services.PostServices;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("my_blog")
public class PostController {
    @Autowired
    PostServices postServices;

    @GetMapping("")
    public ModelAndView getHomePage() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
     @PostMapping("/search")
    public ModelAndView show_search(@RequestParam(name="search", defaultValue = "", required = false) String search){
        ModelAndView modelAndView= new ModelAndView("search", "posts", postServices.searchPost(search));
        return modelAndView;
    }
    @GetMapping("/page/{pageNumber}")
    public ModelAndView showAllPosts(@PathVariable(value = "pageNumber", required = false) int pageNumber,
                                     @RequestParam(required = false,defaultValue = "dateCreated") String sortField,
                                     @RequestParam(required = false, defaultValue = "") String search){
        Page<Post> page= postServices.showAllPosts(pageNumber-1, sortField);

            ModelAndView modelAndView=new ModelAndView("list","posts", page);

            long totalItems = page.getTotalElements();
            int totalPages= page.getTotalPages();

            modelAndView.addObject("totalItems",totalItems);
            modelAndView.addObject("totalPages", totalPages);
            modelAndView.addObject("sortField", sortField);
            modelAndView.addObject("search", search);
            return modelAndView;
    }

    @GetMapping("/create_post")
    public ModelAndView createPostForm(){
        ModelAndView modelAndView= new ModelAndView("create");
        modelAndView.addObject("post", new Post());
        return modelAndView;
    }
    @PostMapping("/create_post")
    public ModelAndView createPost(@ModelAttribute Post post){
        postServices.addPost(post);
        ModelAndView modelAndView= new ModelAndView("index");
        modelAndView.addObject("message","You've created a blog!!!");
        return modelAndView;
    }
    @GetMapping("/view_post/{id}")
    public ModelAndView viewPost(@PathVariable Long id){
        return new ModelAndView("view","post",postServices.viewPostsById(id));
    }
    @GetMapping("/edit_post/{id}")
    public ModelAndView editPost(@PathVariable Long id){
         return new ModelAndView("edit","post",postServices.viewPostsById(id));
    }
    @PostMapping("/edit_post")
    public ModelAndView savePost(@ModelAttribute Post post){
        postServices.editPost(post);
        ModelAndView modelAndView= new ModelAndView("index");
        modelAndView.addObject("message","Edited successfully!");
        return modelAndView;
    }
    @GetMapping("/delete_post/{id}")
    public ModelAndView showDeletedPost(@PathVariable Long id){
        return new ModelAndView("delete","post", postServices.viewPostsById(id));
    }
    @PostMapping("/delete_post/{id}")
    public ModelAndView deletePost(@PathVariable Long id){
        postServices.deletePostById(id);
        ModelAndView modelAndView= new ModelAndView("index");
        modelAndView.addObject("post", new Post());
        modelAndView.addObject("message", "Deleted successfully!!!");
        return modelAndView;
    }


    }
