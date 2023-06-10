package com.example.blog.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.entity.Blog;
import com.example.blog.repository.BlogRepository;

@Service
public class BlogService {
    private BlogRepository blogRepository;

    @Autowired
    public void setRepository(BlogRepository repository) {
        this.blogRepository = repository;
    }

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    public Blog getById(Long id) throws Exception {
        return blogRepository.findById(id).orElseThrow(Exception::new);
    }

    public Long save(Blog blog) throws Exception {
        try {
            Blog savedBlog = blogRepository.save(blog);
            return savedBlog.getId();
        } catch (Exception e) {
            throw new Exception("Failed to save blog");
        }
    }

    public Blog updateById(Long id, Blog blog) throws Exception {
        Blog foundedBlog = blogRepository.findById(id).orElseThrow(Exception::new);
        blog.setId(foundedBlog.getId());
        return blogRepository.save(blog);
    }

    public void delete(Long id) throws Exception {
        try {
            blogRepository.deleteById(id);
        } catch (Exception e) {
            throw new Exception("Failed to delete blog");
        }
    }
}
