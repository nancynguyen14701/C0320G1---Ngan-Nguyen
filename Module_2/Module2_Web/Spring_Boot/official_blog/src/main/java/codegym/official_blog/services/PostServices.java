package codegym.official_blog.services;

import codegym.official_blog.entities.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostServices {

    void addPost(Post post);

    void editPost(Post post);

    void deletePostById(Long id);

    Page<Post> showAllPosts(int pageNumber, String sortField);

    Post viewPostsById(Long id);

    List<Post> searchPost(String search);



}
