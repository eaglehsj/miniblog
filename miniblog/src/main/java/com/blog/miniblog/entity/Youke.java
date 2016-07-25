package com.blog.miniblog.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "youke")
public class Youke {
    /**
     * the ip of youke 
     */
    @Id
    private String ip;

    /**
     * the datetime of  youke see the blog
     */
    private Date datetime;

    /**
     * 获取the ip of youke 
     *
     * @return ip - the ip of youke 
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置the ip of youke 
     *
     * @param ip the ip of youke 
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取the datetime of  youke see the blog
     *
     * @return datetime - the datetime of  youke see the blog
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * 设置the datetime of  youke see the blog
     *
     * @param datetime the datetime of  youke see the blog
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}