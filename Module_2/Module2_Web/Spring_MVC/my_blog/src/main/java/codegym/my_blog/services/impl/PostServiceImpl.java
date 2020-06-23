package codegym.my_blog.services.impl;

import codegym.my_blog.models.Post;
import codegym.my_blog.repositories.PostRepository;
import codegym.my_blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public void createBlog(Post blog) {
        postRepository.save(blog);
    }

    @Override
    public List<Post> showAllBlog() {
        return postRepository.findAllByStatusIsTrue();
    }

    @Override
    public Post updateBlog(Post blog) {
        return postRepository.save(blog);
    }

    @Override
    public Post viewBlogById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBlogById(Long id) {
        Post blog = postRepository.findById(id).orElse(null);
        if (blog != null) {
            blog.setStatus(false);
            postRepository.save(blog);

        }
    }
}

