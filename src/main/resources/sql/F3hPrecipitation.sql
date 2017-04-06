-- auto Generated on 2017-04-06 16:13:53 
-- DROP TABLE IF EXISTS `f3h_precipitation`; 
CREATE TABLE `f3h_precipitation`(
    `id` VARCHAR (50) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `jg` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'jg',
    `jf` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'jf',
    `f3h_id` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'f3hId',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`f3h_precipitation`';
