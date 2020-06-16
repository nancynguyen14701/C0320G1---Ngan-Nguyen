package codegym.my_blog.services;

import codegym.my_blog.models.Post;
import codegym.my_blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PostService {

    void createBlog(Post blog);

    List<Post> showAllBlog();

    void updateBlog(Post blog);

    Post viewBlogById(Long id);

    void deleteBlogById(Long id);


}
