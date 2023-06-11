package com.example.blog.dto.response;

import java.util.List;

import com.example.blog.entity.Blog;

public class ListBlogsResponseDTO {
    private List<Blog> blogPosts;

    private int totalPage;

    private int totalItem;

    private int currentPage;

    public ListBlogsResponseDTO(List<Blog> blogPosts, int totalPage, int totalItem, int currentPage) {
        this.blogPosts = blogPosts;
        this.totalPage = totalPage;
        this.totalItem = totalItem;
        this.currentPage = currentPage;
    }

    public List<Blog> getBlogPosts() {
        return this.blogPosts;
    }

    public void setBlogPosts(List<Blog> blogPosts) {
        this.blogPosts = blogPosts;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalItem() {
        return this.totalItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

}
