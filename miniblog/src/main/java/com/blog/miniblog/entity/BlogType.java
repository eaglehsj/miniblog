package com.blog.miniblog.entity;

import javax.persistence.*;

@Table(name = "blog_type")
public class BlogType {
    /**
     * the id of blog type
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * the type of blog
     */
    @Column(name = "blog_type")
    private String blogType;

    /**
     * 获取the id of blog type
     *
     * @return id - the id of blog type
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置the id of blog type
     *
     * @param id the id of blog type
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取the type of blog
     *
     * @return blog_type - the type of blog
     */
    public String getBlogType() {
        return blogType;
    }

    /**
     * 设置the type of blog
     *
     * @param blogType the type of blog
     */
    public void setBlogType(String blogType) {
        this.blogType = blogType;
    }
}