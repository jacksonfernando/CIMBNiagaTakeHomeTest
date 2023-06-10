package com.example.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.entity.Blog;
import com.example.blog.service.BlogService;

@RestController
@RequestMapping("blog-posts")
public class BlogController {
    BlogService blogService;

    @Autowired
    public void setService(BlogService service) {
        this.blogService = service;
    }

    @GetMapping
    ResponseEntity<List<Blog>> fetchAllBlogPosts() {
        List<Blog> books = blogService.findAll();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    ResponseEntity<Blog> fetchBlogPostById(@PathVariable long id) throws Exception {
        Blog blog = blogService.getById(id);
        return ResponseEntity.ok(blog);
    }

    @PostMapping
    ResponseEntity<String> saveBlogPost(@RequestBody Blog request) {
        try {
            Blog blogRequest = request;
            Long savedBookId = blogService.save(blogRequest);
            return ResponseEntity.created(null).body("Created blog post id: " + savedBookId);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to update blog post");
        }
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteBlogPost(@PathVariable long id) {
        try {
            blogService.delete(id);
            return ResponseEntity.ok("Deleted blog post id: " + id);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to update blog post");
        }
    }

    @PutMapping("/{id}")
    ResponseEntity<String> updateBlogPost(@PathVariable long id, @RequestBody Book book) {
        try {
            Blog updatedBlogPost = blogService.updateById(id, book);
            return ResponseEntity.ok("Book successfully updated: " + updatedBlogPost.toString());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to update blog post");
        }
    }

}
