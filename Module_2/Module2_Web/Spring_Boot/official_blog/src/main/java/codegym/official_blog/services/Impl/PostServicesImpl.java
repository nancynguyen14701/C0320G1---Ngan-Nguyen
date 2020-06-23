package codegym.official_blog.services.Impl;

import codegym.official_blog.entities.Post;
import codegym.official_blog.repositories.PostRepository;
import codegym.official_blog.services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServicesImpl implements PostServices {
    @Autowired
    PostRepository postRepository;
    @Override
    public void addPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public void editPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Page<Post> showAllPosts(int pageNumber, String sortField) {
        Sort sort= Sort.by(Sort.Direction.ASC,sortField);
        Pageable pageable= PageRequest.of(pageNumber,4, sort);
        return postRepository.findAll(pageable);
    }

    @Override
    public Post viewPostsById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public List<Post> searchPost(String search) {
       return postRepository.findAllByTitleContainingOrBodyContaining(search,search);
    }
}
