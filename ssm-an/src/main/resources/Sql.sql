DROP TABLE IF EXISTS `tbl_emp`;

CREATE TABLE `tbl_emp` (
  `empid` varchar(32) NOT NULL,
  `empno` varchar(32) DEFAULT NULL,
  `ename` varchar(32) NOT NULL,
  `job` varchar(32) DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `dept` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`empid`),
  UNIQUE KEY `empno` (`empno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_emp` */

insert  into `tbl_emp`(`empid`,`empno`,`ename`,`job`,`hiredate`,`dept`) values ('15f33e88033f11e892a33c970e4745df','1122','中华人民','教师','2018-01-31','销售部'),('2e55d123034411e892a33c970e4745df','7700','fdsa','fdsa','2018-01-27','教学部');

/*Table structure for table `tbl_user` */

DROP TABLE IF EXISTS `tbl_user`;

CREATE TABLE `tbl_user` (
  `id` varchar(32) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(16) NOT NULL,
  `gender` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `memo` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_user` */

insert  into `tbl_user`(`id`,`username`,`password`,`gender`,`birthday`,`address`,`memo`) values ('1122','jack','rose',1,'2018-01-28','aaa',NULL);
