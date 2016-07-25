package com.blog.miniblog.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "blog")
public class Blog {
    /**
     * the id of blog
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * the date of publish blog
     */
    private Date datetime;

    /**
     * the phone of  blog publisher
     */
    private String phone;

    /**
     * the blog from where
     */
    private Integer source;

    /**
     * the type of blog
     */
    private Integer type;

    /**
     * the title of blog
     */
    private String title;

    /**
     * the number of  commenter comment this blog
     */
    @Column(name = "commenter_number")
    private Integer commenterNumber;

    /**
     * the number of youke which see this blog 
     */
    @Column(name = "youke_number")
    private Integer youkeNumber;

    /**
     * the content of blog 
     */
    private String content;

    /**
     * 获取the id of blog
     *
     * @return id - the id of blog
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置the id of blog
     *
     * @param id the id of blog
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取the date of publish blog
     *
     * @return datetime - the date of publish blog
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * 设置the date of publish blog
     *
     * @param datetime the date of publish blog
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * 获取the phone of  blog publisher
     *
     * @return phone - the phone of  blog publisher
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置the phone of  blog publisher
     *
     * @param phone the phone of  blog publisher
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取the blog from where
     *
     * @return source - the blog from where
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置the blog from where
     *
     * @param source the blog from where
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 获取the type of blog
     *
     * @return type - the type of blog
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置the type of blog
     *
     * @param type the type of blog
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取the title of blog
     *
     * @return title - the title of blog
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置the title of blog
     *
     * @param title the title of blog
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取the number of  commenter comment this blog
     *
     * @return commenter_number - the number of  commenter comment this blog
     */
    public Integer getCommenterNumber() {
        return commenterNumber;
    }

    /**
     * 设置the number of  commenter comment this blog
     *
     * @param commenterNumber the number of  commenter comment this blog
     */
    public void setCommenterNumber(Integer commenterNumber) {
        this.commenterNumber = commenterNumber;
    }

    /**
     * 获取the number of youke which see this blog 
     *
     * @return youke_number - the number of youke which see this blog 
     */
    public Integer getYoukeNumber() {
        return youkeNumber;
    }

    /**
     * 设置the number of youke which see this blog 
     *
     * @param youkeNumber the number of youke which see this blog 
     */
    public void setYoukeNumber(Integer youkeNumber) {
        this.youkeNumber = youkeNumber;
    }

    /**
     * 获取the content of blog 
     *
     * @return content - the content of blog 
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置the content of blog 
     *
     * @param content the content of blog 
     */
    public void setContent(String content) {
        this.content = content;
    }
}