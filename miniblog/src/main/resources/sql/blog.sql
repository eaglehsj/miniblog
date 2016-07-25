/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-07-25 16:44:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `blog`
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(10) NOT NULL COMMENT 'the id of blog',
  `datetime` datetime NOT NULL COMMENT 'the date of publish blog',
  `phone` varchar(50) NOT NULL COMMENT 'the phone of  blog publisher',
  `source` int(3) NOT NULL COMMENT 'the blog from where',
  `type` int(3) NOT NULL COMMENT 'the type of blog',
  `title` varchar(100) NOT NULL COMMENT 'the title of blog',
  `content` text NOT NULL COMMENT 'the content of blog ',
  `commenter_number` int(11) NOT NULL COMMENT 'the number of  commenter comment this blog',
  `youke_number` int(11) NOT NULL COMMENT 'the number of youke which see this blog ',
  PRIMARY KEY (`id`),
  KEY `blog_type` (`type`),
  CONSTRAINT `blog_type` FOREIGN KEY (`type`) REFERENCES `blog_type` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------

-- ----------------------------
-- Table structure for `blog_comment`
-- ----------------------------
DROP TABLE IF EXISTS `blog_comment`;
CREATE TABLE `blog_comment` (
  `blog_id` int(10) NOT NULL COMMENT 'the comment of th blog_id',
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'the id of comment ',
  `child_id` int(10) NOT NULL COMMENT 'the child of comment id',
  `parent_id` int(10) NOT NULL COMMENT 'the id of comment parent',
  `commenter_email` varchar(50) NOT NULL COMMENT 'the email of comment vistor ',
  `datetime` datetime NOT NULL COMMENT 'the datetime of comment',
  `content` text NOT NULL COMMENT 'the content of comment',
  PRIMARY KEY (`id`,`blog_id`,`child_id`,`parent_id`),
  KEY `comment_email` (`commenter_email`),
  KEY `blog_id` (`blog_id`),
  CONSTRAINT `blog_id` FOREIGN KEY (`blog_id`) REFERENCES `blog` (`id`) ON DELETE CASCADE,
  CONSTRAINT `comment_email` FOREIGN KEY (`commenter_email`) REFERENCES `visitor` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `blog_type`
-- ----------------------------
DROP TABLE IF EXISTS `blog_type`;
CREATE TABLE `blog_type` (
  `id` int(3) NOT NULL AUTO_INCREMENT COMMENT 'the id of blog type',
  `blog_type` varchar(255) NOT NULL COMMENT 'the type of blog',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_type
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `phone` varchar(11) NOT NULL DEFAULT '18814122504' COMMENT 'blog master phone number',
  `username` varchar(50) NOT NULL COMMENT 'blog master username',
  `password` varchar(20) NOT NULL COMMENT 'the password of master',
  `email` varchar(50) DEFAULT NULL COMMENT 'the email of blog master',
  `image` varchar(50) DEFAULT NULL COMMENT 'the image of blog master',
  `blog_name` varchar(50) DEFAULT NULL COMMENT 'the name of blog ',
  `blog_motto` varchar(100) DEFAULT NULL COMMENT 'the motto of blog ',
  `desc` text COMMENT 'the desc of blog master',
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('18814122504', 'eagle', '123456', null, null, null, null, null);

-- ----------------------------
-- Table structure for `user_account`
-- ----------------------------
DROP TABLE IF EXISTS `user_account`;
CREATE TABLE `user_account` (
  `id` int(3) NOT NULL AUTO_INCREMENT COMMENT 'the id of account',
  `phone` varchar(11) DEFAULT NULL COMMENT 'the phone of the count ',
  `account_icon` varchar(50) DEFAULT NULL COMMENT 'the image of icon',
  `account_desc` varchar(20) NOT NULL COMMENT 'the desc of account',
  `account_number` varchar(50) NOT NULL COMMENT 'the number of account',
  PRIMARY KEY (`id`),
  KEY `user_phone` (`phone`),
  CONSTRAINT `user_phone` FOREIGN KEY (`phone`) REFERENCES `user` (`phone`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_account
-- ----------------------------

-- ----------------------------
-- Table structure for `visitor`
-- ----------------------------
DROP TABLE IF EXISTS `visitor`;
CREATE TABLE `visitor` (
  `email` varchar(50) NOT NULL COMMENT 'the email of visitor ',
  `username` varchar(25) NOT NULL COMMENT 'the username of visitor',
  `image` varchar(100) DEFAULT NULL COMMENT 'the image of visitor',
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of visitor
-- ----------------------------

-- ----------------------------
-- Table structure for `youke`
-- ----------------------------
DROP TABLE IF EXISTS `youke`;
CREATE TABLE `youke` (
  `ip` varchar(20) NOT NULL COMMENT 'the ip of youke ',
  `datetime` datetime NOT NULL COMMENT 'the datetime of  youke see the blog',
  PRIMARY KEY (`ip`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of youke
-- ----------------------------
