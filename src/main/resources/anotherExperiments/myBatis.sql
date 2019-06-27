DROP DATABASE IF EXISTS mybatis;

CREATE DATABASE IF NOT EXISTS `mybatis`;
USE mybatis;

DROP TABLE IF EXISTS mybatis.subscriber;
CREATE TABLE `mybatis`.`subscriber`
(
    `id`         INT(10)      NOT NULL,
    `name`       VARCHAR(255) NOT NULL,
    `ref_tariff` VARCHAR(10)  NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = MYISAM;

DROP TABLE IF EXISTS mybatis.tariff;
CREATE TABLE `mybatis`.`tariff`
(
    `id`    INT(10)      NOT NULL,
    `descr` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = MYISAM;

DROP TABLE IF EXISTS mybatis.payments;
CREATE TABLE `mybatis`.`payments`
(
    `id`             INT(10) NOT NULL,
    `ref_subscriber` INT(10) NOT NULL,
    `summa`          INT(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = MYISAM;