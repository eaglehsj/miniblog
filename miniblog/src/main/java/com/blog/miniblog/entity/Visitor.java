package com.blog.miniblog.entity;

import javax.persistence.*;

@Table(name = "visitor")
public class Visitor {
    /**
     * the email of visitor 
     */
    @Id
    private String email;

    /**
     * the username of visitor
     */
    private String username;

    /**
     * the image of visitor
     */
    private String image;

    /**
     * 获取the email of visitor 
     *
     * @return email - the email of visitor 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置the email of visitor 
     *
     * @param email the email of visitor 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取the username of visitor
     *
     * @return username - the username of visitor
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置the username of visitor
     *
     * @param username the username of visitor
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取the image of visitor
     *
     * @return image - the image of visitor
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置the image of visitor
     *
     * @param image the image of visitor
     */
    public void setImage(String image) {
        this.image = image;
    }
}