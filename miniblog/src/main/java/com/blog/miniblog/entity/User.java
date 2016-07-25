package com.blog.miniblog.entity;

import javax.persistence.*;

@Table(name = "user")
public class User {
    /**
     * blog master phone number
     */
    @Id
    private String phone;

    /**
     * blog master username
     */
    private String username;

    /**
     * the password of master
     */
    private String password;

    /**
     * the email of blog master
     */
    private String email;

    /**
     * the image of blog master
     */
    private String image;

    /**
     * the name of blog 
     */
    @Column(name = "blog_name")
    private String blogName;

    /**
     * the motto of blog 
     */
    @Column(name = "blog_motto")
    private String blogMotto;

    /**
     * the desc of blog master
     */
    private String desc;

    /**
     * 获取blog master phone number
     *
     * @return phone - blog master phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置blog master phone number
     *
     * @param phone blog master phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取blog master username
     *
     * @return username - blog master username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置blog master username
     *
     * @param username blog master username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取the password of master
     *
     * @return password - the password of master
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置the password of master
     *
     * @param password the password of master
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取the email of blog master
     *
     * @return email - the email of blog master
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置the email of blog master
     *
     * @param email the email of blog master
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取the image of blog master
     *
     * @return image - the image of blog master
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置the image of blog master
     *
     * @param image the image of blog master
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取the name of blog 
     *
     * @return blog_name - the name of blog 
     */
    public String getBlogName() {
        return blogName;
    }

    /**
     * 设置the name of blog 
     *
     * @param blogName the name of blog 
     */
    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    /**
     * 获取the motto of blog 
     *
     * @return blog_motto - the motto of blog 
     */
    public String getBlogMotto() {
        return blogMotto;
    }

    /**
     * 设置the motto of blog 
     *
     * @param blogMotto the motto of blog 
     */
    public void setBlogMotto(String blogMotto) {
        this.blogMotto = blogMotto;
    }

    /**
     * 获取the desc of blog master
     *
     * @return desc - the desc of blog master
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置the desc of blog master
     *
     * @param desc the desc of blog master
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}