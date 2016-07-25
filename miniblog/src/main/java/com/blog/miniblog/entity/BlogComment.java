package com.blog.miniblog.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "blog_comment")
public class BlogComment {
    /**
     * the id of comment 
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * the comment of th blog_id
     */
    @Id
    @Column(name = "blog_id")
    private Integer blogId;

    /**
     * the child of comment id
     */
    @Id
    @Column(name = "child_id")
    private Integer childId;

    /**
     * the id of comment parent
     */
    @Id
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * the email of comment vistor 
     */
    @Column(name = "commenter_email")
    private String commenterEmail;

    /**
     * the datetime of comment
     */
    private Date datetime;

    /**
     * the content of comment
     */
    private String content;

    /**
     * 获取the id of comment 
     *
     * @return id - the id of comment 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置the id of comment 
     *
     * @param id the id of comment 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取the comment of th blog_id
     *
     * @return blog_id - the comment of th blog_id
     */
    public Integer getBlogId() {
        return blogId;
    }

    /**
     * 设置the comment of th blog_id
     *
     * @param blogId the comment of th blog_id
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    /**
     * 获取the child of comment id
     *
     * @return child_id - the child of comment id
     */
    public Integer getChildId() {
        return childId;
    }

    /**
     * 设置the child of comment id
     *
     * @param childId the child of comment id
     */
    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    /**
     * 获取the id of comment parent
     *
     * @return parent_id - the id of comment parent
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置the id of comment parent
     *
     * @param parentId the id of comment parent
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取the email of comment vistor 
     *
     * @return commenter_email - the email of comment vistor 
     */
    public String getCommenterEmail() {
        return commenterEmail;
    }

    /**
     * 设置the email of comment vistor 
     *
     * @param commenterEmail the email of comment vistor 
     */
    public void setCommenterEmail(String commenterEmail) {
        this.commenterEmail = commenterEmail;
    }

    /**
     * 获取the datetime of comment
     *
     * @return datetime - the datetime of comment
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * 设置the datetime of comment
     *
     * @param datetime the datetime of comment
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * 获取the content of comment
     *
     * @return content - the content of comment
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置the content of comment
     *
     * @param content the content of comment
     */
    public void setContent(String content) {
        this.content = content;
    }
}