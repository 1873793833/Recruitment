/*
Navicat MySQL Data Transfer

Source Server         : rj1532
Source Server Version : 50510
Source Host           : localhost:3306
Source Database       : goodjobdb

Target Server Type    : MYSQL
Target Server Version : 50510
File Encoding         : 65001

Date: 2018-04-13 07:31:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `oph` varchar(50) DEFAULT NULL,
  `mp` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `regtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', '123456', '蒋超群', '男', '0734-74855591', '10232231123', '66413666@qq.com', '湖南长沙环境保护职业技术学院', '2017-12-24 17:39:39');
INSERT INTO `admin` VALUES ('2', 'root', '123456', '蒋超群', '男', '74855591', '10232231', '66413666@qq.com', '湖南长沙环境保护职业技术学院', '2018-03-12 10:01:35');

-- ----------------------------
-- Table structure for enterprise_user
-- ----------------------------
DROP TABLE IF EXISTS `enterprise_user`;
CREATE TABLE `enterprise_user` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `e_account` varchar(20) NOT NULL,
  `e_password` varchar(16) NOT NULL,
  `e_company_name` varchar(100) DEFAULT NULL,
  `e_corporate_sector` varchar(100) DEFAULT NULL,
  `e_enterprise_nature` varchar(100) DEFAULT NULL,
  `e_company_info` varchar(1500) DEFAULT NULL,
  `e_address` varchar(100) DEFAULT NULL,
  `e_contacts` varchar(25) DEFAULT '',
  `e_contact_number` varchar(20) DEFAULT NULL,
  `e_phone_number` varchar(20) DEFAULT NULL,
  `e_email` varchar(50) DEFAULT NULL,
  `e_regtime` datetime NOT NULL,
  `e_updatatime` datetime DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `acc_status` int(2) DEFAULT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of enterprise_user
-- ----------------------------
INSERT INTO `enterprise_user` VALUES ('10', 'jack', '1234', '长沙环保集团', '环保', '国有企业', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '湖南长沙', '张宏宇', '0731-8480284802', '17382158803', '23123223@qq.com', '2017-12-24 19:36:29', '2018-01-03 19:13:53', '企业账号', '-1');
INSERT INTO `enterprise_user` VALUES ('11', 'root', '123456', '长沙环保集团', '环保', '国有企业', '公司信息公司信息公司信息公司信息公司信息公司信息', '湖南长沙环境保护职业技术学院', '虢鹰来', '0731-8480284802', '232131258803', '11223@qq.com', '2017-12-24 19:36:29', '2018-04-11 22:35:06', '企业账号', '1');
INSERT INTO `enterprise_user` VALUES ('12', 'mack', '123456', '湖南沅陵大森林宾馆', '旅游', '民营企业', '公司信息公司信息公司信息公司信息公司信息公司信息', '湖南长沙涉外', '粟航', '0731-8480284802', '232131258803', '11223@qq.com', '2017-12-24 19:36:29', '2018-01-03 19:13:47', '企业账号', '-1');
INSERT INTO `enterprise_user` VALUES ('13', 'asdf', '123456', 'asda', 'asdsa', '集体事业', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', 'asd', 'ads', '111', '1111', '111qe', '2017-12-29 13:11:58', '2018-01-03 19:13:43', '企业账号', '1');
INSERT INTO `enterprise_user` VALUES ('14', 'aaaa', '123456', 'ewqea', 'qwew', '三资企业', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', 'qwewq', 'wwqeq', '11', '22', '11', '2017-12-29 13:17:26', '2018-01-03 19:13:39', '企业账号', '-1');
INSERT INTO `enterprise_user` VALUES ('15', 'jiangchaoqun', '123', '谎报学院', '学校', '民营企业', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '浑南产生', '减撒大声地', '12321', '12321', '12312321', '2018-01-03 17:39:23', '2018-01-03 17:39:23', '企业账号', '1');
INSERT INTO `enterprise_user` VALUES ('16', 'jiagchaoqun', '123', '长沙环境保护职业技术学院', '环保', '国有企业', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '湖南长沙环境保护职业技术学院', '张宏宇', '10086123123', '123214323424', '123211@qq.com', '2018-02-26 18:59:44', '2018-02-26 18:59:44', '企业账号', '1');
INSERT INTO `enterprise_user` VALUES ('17', 'asd', '123', '啊实打实多', '啊啊是的撒', '私营企业', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '阿萨', '阿斯顿撒', '123123', '123213', '1231212', '2018-03-06 15:58:11', '2018-03-06 15:58:11', '企业账号', '-1');
INSERT INTO `enterprise_user` VALUES ('24', 'qwe', '123', '其味无穷二其味无穷二无群群翁请问', '驱蚊器翁', '其他', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '其味无穷', '其味无穷', '1111', '1122211', '其味无穷二群翁', '2018-03-07 19:56:52', '2018-03-07 19:56:52', '企业账号', '-1');
INSERT INTO `enterprise_user` VALUES ('25', '凄凄切切', '123', '阿打算的三啊实打实大师大所大所asd', 'asd阿达', '其他', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '阿萨德', '阿达', '12312', '12321', '121', '2018-03-07 20:00:03', '2018-03-07 20:00:03', '企业账号', '-1');
INSERT INTO `enterprise_user` VALUES ('31', 'rrr', '123', '上海华章科技有限公司', '软件', '民营企业', null, '上海市浦东新区', '张某某', '10086123123', '123213', '123211@qq.com', '2018-03-12 16:57:04', '2018-03-12 16:57:04', '企业账号', '-1');
INSERT INTO `enterprise_user` VALUES ('32', 'jiang', '123456', '新保科技', '软件技术', '私营企业', null, '公司地址', '联系人', '123', '123231312', '111111', '2018-04-12 21:35:31', '2018-04-12 21:35:31', '企业账号', '0');

-- ----------------------------
-- Table structure for individual_user
-- ----------------------------
DROP TABLE IF EXISTS `individual_user`;
CREATE TABLE `individual_user` (
  `i_id` int(11) NOT NULL AUTO_INCREMENT,
  `i_account` varchar(30) NOT NULL,
  `i_password` varchar(20) NOT NULL,
  `i_name` varchar(10) DEFAULT NULL,
  `i_sex` varchar(2) DEFAULT NULL,
  `i_nation` varchar(50) DEFAULT NULL,
  `i_data_of_birth` datetime DEFAULT NULL,
  `i_tel` varchar(20) DEFAULT NULL,
  `i_post_code` int(10) DEFAULT NULL,
  `i_emial` varchar(25) DEFAULT NULL,
  `i_job_intension` varchar(500) DEFAULT NULL,
  `i_domicile` varchar(500) DEFAULT NULL,
  `i_hobby` varchar(500) DEFAULT NULL,
  `i_educational_bg` varchar(1000) DEFAULT NULL,
  `i_major` varchar(50) DEFAULT NULL,
  `i_graduate_school` varchar(50) DEFAULT NULL,
  `i_experience` varchar(500) DEFAULT NULL,
  `i_evaluation` varchar(500) DEFAULT NULL,
  `i_skill` varchar(500) DEFAULT NULL,
  `i_regtime` datetime NOT NULL,
  `i_updatatime` datetime DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `acc_status` int(2) DEFAULT NULL,
  PRIMARY KEY (`i_id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of individual_user
-- ----------------------------
INSERT INTO `individual_user` VALUES ('1', 'jack', '123', '测试测试', '男', '民族民族民族', '1231-02-03 00:00:00', '1873793833', '99911', '1873783933', '求职意向求职意向求职意向求职意向', '住所住所住所', '兴趣爱好', '学历学历', '所学专业所学专业', '毕业学院毕业学院毕业学院', '荣誉奖项或工作经验', '自我评价', '专业技能', '2017-12-27 16:43:52', '2018-03-11 08:02:08', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('15', 'rock', '123456', '简志浩', '男', '汉族', '2018-02-17 00:00:00', '', null, '', '', '', '', '', '', '', '', '', '', '2017-12-27 16:43:52', '2018-04-11 22:58:35', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('16', 'make', '123456', '金士顿', '女', '满族', '2018-02-17 11:00:57', null, null, null, null, null, null, null, null, null, null, null, null, '2017-12-27 16:43:52', '2017-12-29 00:00:00', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('17', 'wangwu', 'jiangjiang980816', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-02-26 19:11:01', '2018-02-26 19:11:01', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('18', 'wang', 'asd', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-02-26 19:15:42', '2018-02-26 19:15:42', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('19', 'yaya', '123', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-02-26 19:22:55', '2018-02-26 19:22:55', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('20', 'wuwu', '123', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-02-26 19:25:33', '2018-02-26 19:25:33', '个人账号', '-1');
INSERT INTO `individual_user` VALUES ('21', 'lzj', '123', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-02-26 20:24:43', '2018-02-26 20:24:43', '个人账号', '-1');
INSERT INTO `individual_user` VALUES ('24', 'rr', '123', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-03-06 15:43:13', '2018-03-06 15:43:13', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('25', '1', '123', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-03-11 10:46:42', '2018-03-11 10:46:42', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('36', 'jack', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-03-11 11:06:12', '2018-03-11 11:06:12', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('58', '请问', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-03-11 14:33:33', '2018-03-11 14:33:33', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('59', 'kaka', '123', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-03-12 17:12:08', '2018-03-12 17:12:08', '个人账号', '1');
INSERT INTO `individual_user` VALUES ('60', 'jiang', '123456', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2018-04-11 23:06:24', '2018-04-11 23:06:24', '个人账号', '1');

-- ----------------------------
-- Table structure for recruitment_info
-- ----------------------------
DROP TABLE IF EXISTS `recruitment_info`;
CREATE TABLE `recruitment_info` (
  `i_id` int(11) NOT NULL AUTO_INCREMENT,
  `position` varchar(50) DEFAULT NULL,
  `place` varchar(50) DEFAULT NULL,
  `corporate_name` varchar(100) DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  `corporate_sector` varchar(50) DEFAULT NULL,
  `enterprise_nature` varchar(50) DEFAULT NULL,
  `education` varchar(50) DEFAULT NULL,
  `number_of_recruits` int(5) DEFAULT NULL,
  `corporate_welfare` varchar(255) DEFAULT NULL,
  `job_information` varchar(500) DEFAULT NULL,
  `contact_information` varchar(500) DEFAULT NULL,
  `company_information` varchar(1500) DEFAULT NULL,
  `release_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `enterprise_id` int(11) DEFAULT NULL,
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`i_id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recruitment_info
-- ----------------------------
INSERT INTO `recruitment_info` VALUES ('19', '游戏工程师', '湖南长沙', '长沙某某有限公司', '10000.00', '互联网', '私营公司', '本科以上', '6', '五险一金，年终奖，团建旅游', '1. 大专及以上学历\r\n2. 熟练掌握SQL SERVER开发、使用及优化\r\n3. 精通C#，熟悉三层（多层）架构开发、Webservice、WinForm开发\r\n4. 有刻苦钻研精神及较强的学习能力\r\n5. 热爱本职工作，有工作激情和提升自己的欲望\r\n6. 具备良好的团队合作精神\r\n7. 有ERP软件开发经验者优先', '张宏宇1000', '广州易神软件科技有限公司成立于1999年，是由香港宝典管理咨询公司与广州宏信软件科技有限公司共同投资创立的高新技术企业，总部设在中国十大软件园之一的广州天河软件园区内。公司从成立之日起便致力于服饰企业管理软件系统的研究、开发与服务，为中国的服饰企业提供完整的信息化建设解决方案和应用服务。', '2017-12-27 16:37:29', '2018-03-16 20:56:11', '11', '-1');
INSERT INTO `recruitment_info` VALUES ('20', '游戏开发工程师', '湖南长沙', '长沙环保集团', '232.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-03 17:28:19', '2018-01-03 17:28:19', '10', '1');
INSERT INTO `recruitment_info` VALUES ('21', '软件开发工程师', '湖南长沙', '长沙环保集团', '222.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-03 17:28:19', '2018-01-03 17:28:19', '10', '-1');
INSERT INTO `recruitment_info` VALUES ('22', '房地产经理', '湖南长沙', '长沙环保集团', '2142.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-03 17:28:19', '2018-01-03 17:28:19', '10', '1');
INSERT INTO `recruitment_info` VALUES ('23', 'UI美工', '湖南长沙', '长沙环保集团', '10000.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-06 17:28:19', '2018-01-06 17:28:19', '10', '1');
INSERT INTO `recruitment_info` VALUES ('24', '前端设计', '湖南长沙', '长沙环保集团', '3020.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-06 17:28:19', '2018-01-06 17:28:19', '10', '1');
INSERT INTO `recruitment_info` VALUES ('25', '水工', '湖南长沙', '长沙环保集团', '4000.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-06 17:28:19', '2018-01-06 17:28:19', '10', '1');
INSERT INTO `recruitment_info` VALUES ('26', '电工', '湖南长沙', '长沙环保集团', '5000.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-06 17:28:19', '2018-01-06 17:28:19', '10', '1');
INSERT INTO `recruitment_info` VALUES ('27', '包工头', '湖南长沙', '长沙环保集团', '7800.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-09 17:28:19', '2018-01-09 17:28:19', '10', '-1');
INSERT INTO `recruitment_info` VALUES ('29', '主持人', '湖南长沙', '长沙环保集团', '10000.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-12 17:28:19', '2018-01-12 17:28:19', '10', '-1');
INSERT INTO `recruitment_info` VALUES ('30', '游戏工程师', '湖南长沙', '长沙某某有限公司', '10000.00', '互联网', '私营公司', '本科以上', '5', '五险一金，年终奖，团建旅游', '1. 大专及以上学历\r\n2. 熟练掌握SQL SERVER开发、使用及优化\r\n3. 精通C#，熟悉三层（多层）架构开发、Webservice、WinForm开发\r\n4. 有刻苦钻研精神及较强的学习能力\r\n5. 热爱本职工作，有工作激情和提升自己的欲望\r\n6. 具备良好的团队合作精神\r\n7. 有ERP软件开发经验者优先', 'asdsa', '广州易神软件科技有限公司成立于1999年，是由香港宝典管理咨询公司与广州宏信软件科技有限公司共同投资创立的高新技术企业，总部设在中国十大软件园之一的广州天河软件园区内。公司从成立之日起便致力于服饰企业管理软件系统的研究、开发与服务，为中国的服饰企业提供完整的信息化建设解决方案和应用服务。', '2017-12-27 16:37:29', '2018-04-11 22:32:09', '11', '0');
INSERT INTO `recruitment_info` VALUES ('31', '游戏开发工程师', '湖南长沙', '长沙环保集团', '60000.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-12 17:28:19', '2018-01-03 17:28:19', '10', '-1');
INSERT INTO `recruitment_info` VALUES ('32', '软件开发工程师', '湖南长沙', '长沙环保集团', '10000.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-12 17:28:19', '2018-01-03 17:28:19', '10', '1');
INSERT INTO `recruitment_info` VALUES ('33', '房地产经理', '湖南长沙', '长沙环保集团', '90000.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-03 17:28:19', '2018-01-03 17:28:19', '10', '1');
INSERT INTO `recruitment_info` VALUES ('34', 'UI美工', '湖南长沙', '长沙环保集团', '32000.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-06 17:28:19', '2018-01-06 17:28:19', '10', '1');
INSERT INTO `recruitment_info` VALUES ('36', '水工', '湖南长沙', '长沙环保集团', '530000.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-06 17:28:19', '2018-01-06 17:28:19', '10', '1');
INSERT INTO `recruitment_info` VALUES ('37', '电工', '湖南长沙', '长沙环保集团', '52000.00', '环保', '国有企业', '本科', '3', '年终奖，团建，提成', '要求本科以上，能加班，能熬夜', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-01-06 17:28:19', '2018-01-06 17:28:19', '10', '-1');
INSERT INTO `recruitment_info` VALUES ('38', '清洁工', '湖南长沙', '长沙环保集团', '10000.00', '环保', '国有企业', '不限', '10', '年终奖，团建，提成', '要求积极上进', '联系人:张宏宇,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息公司信息公司信息', '2018-02-24 21:36:10', '2018-02-24 21:36:10', '10', '0');
INSERT INTO `recruitment_info` VALUES ('39', '吃鸡开发', '上海', '长沙环保集团', '1233213.00', '环保', '', '大专以上', '4', '年终奖', '要求能吃苦耐劳', '联系人:虢鹰来,联系电话:0731-8480284802', '公司信息公司信息公司信息公司信息公司信息公司信息', '2018-03-04 20:39:39', '2018-03-11 08:04:29', '11', '-1');

-- ----------------------------
-- Table structure for resume_info
-- ----------------------------
DROP TABLE IF EXISTS `resume_info`;
CREATE TABLE `resume_info` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(10) DEFAULT NULL,
  `r_sex` varchar(2) DEFAULT NULL,
  `r_data_of_birth` datetime DEFAULT NULL,
  `r_tel` varchar(20) DEFAULT NULL,
  `r_nation` varchar(100) DEFAULT NULL,
  `r_email` varchar(30) DEFAULT NULL,
  `r_post_code` int(10) DEFAULT NULL,
  `r_position` varchar(255) DEFAULT NULL,
  `r_domicile` varchar(100) DEFAULT NULL,
  `r_skill_specialty` varchar(500) DEFAULT NULL,
  `r_hobby` varchar(500) DEFAULT NULL,
  `r_education_bg` varchar(1000) DEFAULT NULL,
  `r_major` varchar(255) DEFAULT NULL,
  `r_graduate_school` varchar(255) DEFAULT NULL,
  `r_experience` varchar(1000) DEFAULT NULL,
  `r_evaluation` varchar(1000) DEFAULT NULL,
  `submission_date` datetime DEFAULT NULL,
  `drafts` varchar(10) DEFAULT NULL,
  `r_state` int(1) DEFAULT NULL,
  `individual_id` int(11) NOT NULL,
  `recruitment_infoid` int(11) DEFAULT NULL,
  `e_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resume_info
-- ----------------------------
INSERT INTO `resume_info` VALUES ('2', '撒大声地', '男', '2017-12-29 14:35:06', '123213', '阿萨德', '阿萨德', '122', '软件工程师', '萨', '撒大声地', '阿萨德', '本,萨达', '阿萨德', '阿打算', '按时', '阿萨德', '2017-12-29 13:59:43', '未存入', '1', '1', '19', '11');
INSERT INTO `resume_info` VALUES ('3', '阿萨德', '男', '2017-12-20 00:00:00', '10086', '汉族', '136879879@qq.com', '123321', '软件工程师', '湖南长沙', '阿萨德', '阿萨德', '本科,按时大大撒', '计算机', '环保学院', '阿萨德', '捱三顶五', '2017-12-29 14:34:57', '未存入', '0', '1', '30', '11');
INSERT INTO `resume_info` VALUES ('6', '国迎来', '男', '2017-12-28 16:23:48', '10086', '汉族', '111111@qq.com', '21123', '软件工程师', '住所住所', '技能专长技能专长', '兴趣爱好', '本科', '主修专业', '毕业学院', '工作经验', '自我评价', '2018-02-27 16:41:20', '未存入', '1', '1', '19', '11');
INSERT INTO `resume_info` VALUES ('10', '国迎来', '男', '2015-10-28 00:00:00', '10086', '汉族', '111111@qq.com', '21123', '软件工程师', '住所住所', '技能专长技能专长', '兴趣爱好', '本科', '主修专业', '毕业学院', '工作经验', '自我评价', '2017-12-28 16:27:43', '存入', '0', '1', '19', '11');
INSERT INTO `resume_info` VALUES ('11', '国迎来', '男', '2017-09-28 00:00:00', '10086', '汉族', '111111@qq.com', '21123', '软件工程师', '住所住所', '技能专长技能专长', '兴趣爱好', '本科', '主修专业', '毕业学院', '工作经验', '自我评价', '2017-12-28 16:27:43', '存入', '0', '1', '19', '11');
INSERT INTO `resume_info` VALUES ('12', '国迎来', '男', '2017-12-28 16:23:48', '10086', '汉族', '111111@qq.com', '21123', '软件工程师', '住所住所', '技能专长技能专长', '兴趣爱好', '本科', '主修专业', '毕业学院', '工作经验', '自我评价', '2017-12-28 16:27:43', '存入', '0', '1', '19', '11');
INSERT INTO `resume_info` VALUES ('13', 'pipipi', '男', '2017-12-28 00:00:00', '10086', '汉族', '111111@qq.com', '21123', '软件工程师', '住所住所', '技能专长技能专长', '兴趣爱好', '本科', '主修专业', '毕业学院', '工作经验', '自我评价', '2017-12-28 16:27:43', '存入', '0', '1', '19', '11');
INSERT INTO `resume_info` VALUES ('14', '国迎来', '男', '2017-12-28 16:23:48', '10086', '汉族', '111111@qq.com', '21123', '软件工程师', '住所住所', '技能专长技能专长', '兴趣爱好', '本科', '主修专业', '毕业学院', '工作经验', '自我评价', '2018-03-11 08:01:36', '未存入', '0', '1', '19', '11');
INSERT INTO `resume_info` VALUES ('17', '国迎来', '男', '2017-12-28 16:23:48', '10086', '汉族', '111111@qq.com', '21123', '软件工程师', '住所住所', '技能专长技能专长', '兴趣爱好', '本科', '主修专业', '毕业学院', '工作经验', '自我评价', '2018-03-04 20:19:05', '未存入', '1', '1', '19', '11');
INSERT INTO `resume_info` VALUES ('20', '测试测试', '男', '1231-02-03 00:00:00', '1873793833', '民族民族民族', '1873783933', '99911', '游戏工程师', '住所住所住所', '专业技能', '兴趣爱好', '学历学历', '所学专业所学专业', '毕业学院毕业学院毕业学院', '荣誉奖项或工作经验', '自我评价', '2018-03-04 20:18:40', '未存入', '1', '1', '19', '11');
INSERT INTO `resume_info` VALUES ('21', '测试测试', '男', '1231-02-03 00:00:00', '1873793833', '民族民族民族', '1873783933', '99911', '游戏工程师', '住所住所住所', '专业技能', '兴趣爱好', '学历学历', '所学专业所学专业', '毕业学院毕业学院毕业学院', '荣誉奖项或工作经验', '自我评价', '2018-03-04 14:57:20', '未存入', '1', '1', '19', '11');
INSERT INTO `resume_info` VALUES ('22', 'yAYA', '男', '1998-10-07 00:00:00', '100000', '汉族', '136879879@qq.com', '12321', '游戏工程师', '上海', '测试测试测试测试测试测试测试测试测试测试测试测试测试测试', '测试测试测试测试测试测试测试测试测试测试测试', '本科', '计算机应用', '长沙环境保护职业技术学院', '测试测试测试测试测试测试测试测试测试测试测试测试测试测试', '测试测试测试测试测试测试测试测试测试测试测试', '2018-03-16 17:49:02', '未存入', '0', '19', '19', '11');
INSERT INTO `resume_info` VALUES ('23', 'j讲哈', '男', '1099-12-20 00:00:00', '测试', '测试', '136879879@qq.com', '2222', '软件开发工程师', '测试', '', '', '测试', '测试', '测试', '', '', '2018-03-16 18:33:02', '存入', '0', '19', '32', '10');
INSERT INTO `resume_info` VALUES ('24', '简志浩', '男', '2018-02-17 00:00:00', '11', '汉族', '请问', '111', '水工', '请问', '请问', '吹牛', '啊实打实大师大所', '其味无穷', '驱蚊器其味无穷二驱蚊器翁无群二', '没有', '很屌', '2018-04-08 22:23:03', '存入', '0', '15', '36', '10');
INSERT INTO `resume_info` VALUES ('25', '简志浩', '男', '2018-02-17 00:00:00', '', '汉族', '', null, '前端设计', '', '', '', '为', '', '', '', '', '2018-04-10 22:45:33', '未存入', '0', '15', '24', '10');
