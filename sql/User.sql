-- auto Generated on 2017-06-09 16:39:50 
-- DROP TABLE IF EXISTS `user`; 
CREATE TABLE `user`(
    `id` VARCHAR (50) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `login_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'login_name',
    `name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
    `password` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'password',
    `age` INT (11) NOT NULL DEFAULT -1 COMMENT 'age',
    `sex` INT (11) NOT NULL DEFAULT -1 COMMENT 'sex',
    `salt` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'salt',
    `phone` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'phone',
    `user_type` INT (11) NOT NULL DEFAULT -1 COMMENT 'user_type',
    `status` INT (11) NOT NULL DEFAULT -1 COMMENT 'status',
    `organization_id` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'organization_id',
    `create_time` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'create_time',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`user`';
