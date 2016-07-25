package com.blog.miniblog.entity;

import javax.persistence.*;

@Table(name = "user_account")
public class UserAccount {
    /**
     * the id of account
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * the phone of the count 
     */
    private String phone;

    /**
     * the image of icon
     */
    @Column(name = "account_icon")
    private String accountIcon;

    /**
     * the desc of account
     */
    @Column(name = "account_desc")
    private String accountDesc;

    /**
     * the number of account
     */
    @Column(name = "account_number")
    private String accountNumber;

    /**
     * 获取the id of account
     *
     * @return id - the id of account
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置the id of account
     *
     * @param id the id of account
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取the phone of the count 
     *
     * @return phone - the phone of the count 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置the phone of the count 
     *
     * @param phone the phone of the count 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取the image of icon
     *
     * @return account_icon - the image of icon
     */
    public String getAccountIcon() {
        return accountIcon;
    }

    /**
     * 设置the image of icon
     *
     * @param accountIcon the image of icon
     */
    public void setAccountIcon(String accountIcon) {
        this.accountIcon = accountIcon;
    }

    /**
     * 获取the desc of account
     *
     * @return account_desc - the desc of account
     */
    public String getAccountDesc() {
        return accountDesc;
    }

    /**
     * 设置the desc of account
     *
     * @param accountDesc the desc of account
     */
    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc;
    }

    /**
     * 获取the number of account
     *
     * @return account_number - the number of account
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置the number of account
     *
     * @param accountNumber the number of account
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}