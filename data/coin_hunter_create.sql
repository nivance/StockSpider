DROP TABLE IF EXISTS `t_rise_fall_overview`;
CREATE TABLE `t_rise_fall_overview`
(
    `ID`          BIGINT(16) NOT NULL DEFAULT '0' COMMENT '主键',
    `DAY`         varchar(10) NOT NULL DEFAULT '' COMMENT '日期',
    `RISE`        int(11) NOT NULL DEFAULT '0' COMMENT '上涨家数',
    `FALL`        int(11) NOT NULL DEFAULT '0' COMMENT '下跌家数',
    `FLAT`        int(11) NOT NULL DEFAULT '0' COMMENT '平盘数',
    `RISE0_3`     int(11) NOT NULL DEFAULT '0' COMMENT '涨幅0%~3%数',
    `RISE3_5`     int(11) NOT NULL DEFAULT '0' COMMENT '涨幅3%~5%数',
    `RISE5_10`    int(11) NOT NULL DEFAULT '0' COMMENT '涨幅5%~10%涨家数',
    `RISE_10`     int(11) NOT NULL DEFAULT '0' COMMENT '涨幅大于10%数',
    `RISE_30`     int(11) NOT NULL DEFAULT '0' COMMENT '涨幅大于30%数',
    `RISE_50`     int(11) NOT NULL DEFAULT '0' COMMENT '涨幅大于50%数',
    `RISE_100`    int(11) NOT NULL DEFAULT '0' COMMENT '涨幅大于100%数',
    `FALL0_3`     int(11) NOT NULL DEFAULT '0' COMMENT '跌幅0%~3%数',
    `FALL3_5`     int(11) NOT NULL DEFAULT '0' COMMENT '跌幅3%~5%数',
    `FALL5_10`    int(11) NOT NULL DEFAULT '0' COMMENT '跌幅5%~10%数',
    `FALL_10`     int(11) NOT NULL DEFAULT '0' COMMENT '跌幅大于10%数',
    `FALL_30`     int(11) NOT NULL DEFAULT '0' COMMENT '跌幅大于30%数',
    `FALL_50`     int(11) NOT NULL DEFAULT '0' COMMENT '跌幅大于50%数',
    `FALL_100`    int(11) NOT NULL DEFAULT '0' COMMENT '跌幅大于100%数',
    `VOLUME`      DECIMAL(24, 12)      DEFAULT NULL COMMENT '成交量',
    `MARKET_CAP`  DECIMAL(24, 12)      DEFAULT NULL COMMENT '市值',
    `CREATE_TIME` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_TIME` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`ID`),
    UNIQUE INDEX `UNQ_RISE_FALL_OVERVIEW_DAY`(`DAY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='涨跌分析表';


DROP TABLE IF EXISTS `t_volume`;
CREATE TABLE `t_volume`
(
    `ID`                BIGINT(16) NOT NULL DEFAULT '0' COMMENT '主键',
    `DAY`               varchar(10)  NOT NULL DEFAULT '' COMMENT '日期',
    `CAP_ID`            varchar(32)  NOT NULL DEFAULT '' COMMENT 'cap id',
    `NAME`              varchar(128) NOT NULL DEFAULT '' COMMENT '名称',
    `TITLE`             varchar(128) NOT NULL DEFAULT '' COMMENT '标题',
    `DESCRIPTION`       VARCHAR(512) NOT NULL DEFAULT '' COMMENT '简介',
    `NUM_TOKENS`        INT(11) NOT NULL DEFAULT '0' COMMENT 'token数',
    `AVG_PRICE_CHANGE`  DECIMAL(17, 12)       DEFAULT NULL COMMENT '平均价格变化',
    `MARKET_CAP`        DECIMAL(24, 12)       DEFAULT NULL COMMENT '市值',
    `MARKET_CAP_CHANGE` DECIMAL(24, 12)       DEFAULT NULL COMMENT '市值变化',
    `VOLUME`            DECIMAL(24, 12)       DEFAULT NULL COMMENT '成交量',
    `VOLUME_CHANGE`     DECIMAL(24, 12)       DEFAULT NULL COMMENT '成交量变化',
    `LAST_UPDATED`      BIGINT(16) NOT NULL DEFAULT '0' COMMENT '最好更新时间',
    `CREATE_TIME`       timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_TIME`       timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='成交量表';

-- 成交量；类别周期表；龙头板块统计表；市场连续高度表现；市场连续跌幅表现；涨停梯队；板块梯队；行业新高；



DROP TABLE IF EXISTS `t_pay`;
CREATE TABLE `t_pay`
(
    `ID`                         int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `USER_ID`                    BIGINT(16) NOT NULL DEFAULT '0' COMMENT '充值人ID',
    `AMOUNT`                     int(11) NOT NULL DEFAULT '0' COMMENT '金额',
    `PAY_ID`                     varchar(64) NOT NULL DEFAULT '' COMMENT '支付id',
    `FROM`                       varchar(32) NOT NULL DEFAULT 'Stripe' COMMENT '支付渠道',
    `CURRENCY`                   varchar(32) NOT NULL DEFAULT '' COMMENT '币种',
    `TELEGRAM_PAYMENT_CHARGE_ID` varchar(64) NOT NULL DEFAULT '' COMMENT 'telegram充值ID',
    `PROVIDER_PAYMENT_CHARGE_ID` varchar(64) NOT NULL DEFAULT '' COMMENT '支付渠道充值ID',
    `CREATE_TIME`                timestamp   NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
    `UPDATE_TIME`                timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`ID`),
    KEY                          `INX_PAY_USER` (`USER_ID`),
    KEY                          `INX_PAY_CREATE_TIME`(`CREATE_TIME`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='充值表';


DROP TABLE IF EXISTS `t_comsume`;
CREATE TABLE `t_comsume`
(
    `ID`          int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `USER_ID`     BIGINT(16) NOT NULL DEFAULT '0' COMMENT '用户ID',
    `IMG_URL`     varchar(128) NOT NULL DEFAULT '' COMMENT '图片地址',
    `TYPE`        varchar(64)  NOT NULL DEFAULT '' COMMENT '场景',
    `POINT`       int(11) NOT NULL DEFAULT '0' COMMENT '消费积分',
    `CREATE_TIME` timestamp    NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
    `UPDATE_TIME` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`ID`),
    KEY           `INX_COMSUME_USER` (`USER_ID`),
    KEY           `INX_COMSUME_CREATE_TIME`(`CREATE_TIME`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='消费记录表';


DROP TABLE IF EXISTS `t_stat_click_pay`;
CREATE TABLE `t_stat_click_pay`
(
    `ID`          int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `USER_ID`     BIGINT(16) NOT NULL DEFAULT '0' COMMENT '用户ID',
    `CREATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
    `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`ID`),
    KEY           `INX_CLICK_PAY_USER` (`USER_ID`),
    KEY           `INX_CLICK_PAY_CREATE_TIME`(`CREATE_TIME`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='点击支付记录表';


DROP TABLE IF EXISTS `t_stat_click_buy`;
CREATE TABLE `t_stat_click_buy`
(
    `ID`          int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `USER_ID`     BIGINT(16) NOT NULL DEFAULT '0' COMMENT '用户ID',
    `AMOUNT`      int(11) NOT NULL DEFAULT '0' COMMENT '金额',
    `CREATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
    `UPDATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`ID`),
    KEY           `INX_CLICK_BUY_USER` (`USER_ID`),
    KEY           `INX_CLICK_BUY_CREATE_TIME`(`CREATE_TIME`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='点击购买记录表';


DROP TABLE IF EXISTS `t_face_swap_log`;
CREATE TABLE `t_face_swap_log`
(
    `ID`                INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `USER_ID`           BIGINT(16) NOT NULL DEFAULT '0' COMMENT '用户ID',
    `SOURCE_IMG_FILEID` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '源图fileId',
    `TARGET_IMG_FILEID` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '模板图fileId',
    `STATUS`            INT(3) NOT NULL DEFAULT '1' COMMENT '换脸状态',
    `CREATE_TIME`       timestamp    NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
    `UPDATE_TIME`       timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`ID`),
    KEY                 `INX_FACE_SWAP_USER` (`USER_ID`),
    KEY                 `INX_FACE_SWAP_CREATE_TIME`(`CREATE_TIME`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='换脸记录记录表';


DROP TABLE IF EXISTS `t_face_random_log`;
CREATE TABLE `t_face_random_log`
(
    `ID`            INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `USER_ID`       BIGINT(16) NOT NULL DEFAULT '0' COMMENT '用户ID',
    `STYLE`         VARCHAR(16)  NOT NULL DEFAULT '' COMMENT '风格',
    `RANDOM_NUMBER` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '换脸状态',
    `CREATE_TIME`   timestamp    NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
    `UPDATE_TIME`   timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`ID`),
    KEY             `INX_FACE_RANDOM_USER` (`USER_ID`, `STYLE`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='随机换脸记录表';


