-- 股票相关数据库表

-- 每日价格数据表
drop table if exists day_price;
create table day_price
(
    ID             BIGINT(16) AUTO_INCREMENT COMMENT '自增主键',
    CODE           VARCHAR(8)   NOT NULL DEFAULT '' COMMENT '股票代码',
    NAME           VARCHAR(128) NOT NULL DEFAULT '' COMMENT '股票名称',
    TRADING_DATE   DATE COMMENT '交易日期（YYYY-MM-DD）',
    OPENING_PRICE  DECIMAL(10, 2) COMMENT '开盘价格（单位：元）',
    CLOSING_PRICE  DECIMAL(10, 2) COMMENT '收盘价格（单位：元）',
    PEAK_PRICE     DECIMAL(10, 2) COMMENT '当天最高价格（单位：元）',
    BOTTOM_PRICE   DECIMAL(10, 2) COMMENT '当天最底价格（单位：元）',
    CHANGE_RATE    DECIMAL(8, 2) COMMENT '涨跌幅%',
    CHANGE_AMOUNT  DECIMAL(8, 2) COMMENT '涨跌额（单位：元）',
    TRADING_VOLUME INT(8) COMMENT '成交量（单位：手）',
    TRADING_AMOUNT DECIMAL(16, 2) COMMENT '成交额（单位：元）',
    AMPLITUDE_RATE DECIMAL(12, 2) COMMENT '振幅%',
    TURNOVER_RATE  DECIMAL(8, 2) COMMENT '换手率%',
    GMT_CREATE     DATETIME              DEFAULT CURRENT_TIMESTAMP,
    GMT_MODIFIED   DATETIME              DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (ID),
    UNIQUE INDEX `UNQ_DAY_PRICE_CODE`(`CODE`, `TRADING_DATE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 comment='股票每日价格表';


-- 公司信息表--
-------------------------------
-- Table structure for company_info
-- ----------------------------
DROP TABLE IF EXISTS `company_info`;
CREATE TABLE `company_info`
(
    ID               BIGINT(16) AUTO_INCREMENT COMMENT '自增主键',
    CODE             VARCHAR(8)    NOT NULL DEFAULT '' COMMENT '股票代码',
    NAME             VARCHAR(128)  NOT NULL DEFAULT '' COMMENT '股票名称',
    ORG_NAME         VARCHAR(64)   NOT NULL DEFAULT '' COMMENT '公司名称',
    ORG_NAME_EN      VARCHAR(128)  NOT NULL DEFAULT '' COMMENT '公司英文名称',
    ORG_PROFILE      TEXT          NOT NULL COMMENT '公司简介',
    INDUSTRY         VARCHAR(64)   NOT NULL DEFAULT '' COMMENT '所属东财行业',
    ORG_TEL          VARCHAR(128)  NOT NULL DEFAULT '' COMMENT '公司联系电话',
    ORG_WEB          VARCHAR(64)   NOT NULL DEFAULT '' COMMENT '公司网站',
    PROVINCE         VARCHAR(8)    NOT NULL DEFAULT '' COMMENT '区域',
    REG_ADDRESS      VARCHAR(256)  NOT NULL DEFAULT '' COMMENT '注册地址',
    ADDRESS          VARCHAR(256)  NOT NULL DEFAULT '' COMMENT '公司地址',
    ADDRESS_POSTCODE VARCHAR(32)   NOT NULL DEFAULT '' COMMENT '邮政编码',
    BUSINESS_SCOPE   VARCHAR(2048) NOT NULL DEFAULT '' COMMENT '业务范围',
    CHAIRMAN         VARCHAR(64)   NOT NULL DEFAULT '' COMMENT '董事长',
    INDEDIRECTORS    VARCHAR(256)  NOT NULL DEFAULT '' COMMENT '独立董事',
    LEGAL_PERSON     VARCHAR(64)   NOT NULL DEFAULT '' COMMENT '法人',
    REG_NUM          VARCHAR(32)   NOT NULL DEFAULT '' COMMENT '工商登记',
    REG_CAPITAL      INT(8) COMMENT '注册资本(万元)',
    SECUCODE         VARCHAR(10)   NOT NULL DEFAULT '' COMMENT '证券代码',
    SECURITY_TYPE    VARCHAR(32)   NOT NULL DEFAULT '' COMMENT '证券类别',
    MARKET           INT(2) COMMENT '市场（0:深证A股，1:上证A股）',
    OPEN_STATUS      INT(2) NOT NULL DEFAULT 1 COMMENT '0:退市，1:正常交易',
    TYPE             INT(2) NOT NULL DEFAULT 0 COMMENT '股票类型（0:正常，1:ST）',
    LISTING_DATE     DATE COMMENT '上市日期（YYYY-MM-DD）',
    NATION           VARCHAR(16)   NOT NULL DEFAULT '' COMMENT '国家',
    GMT_CREATE       DATETIME               DEFAULT CURRENT_TIMESTAMP,
    GMT_MODIFIED     DATETIME               DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (ID),
    UNIQUE INDEX `UNQ_COMPANY_INFO_CODE`(`CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 comment='公司信息表';

-- 股票分红记录表--
-- ----------------------------
-- Table structure for stock_dividend
-- ----------------------------
DROP TABLE IF EXISTS `stock_dividend`;
CREATE TABLE `stock_dividend`
(
    ID                 BIGINT(16) AUTO_INCREMENT COMMENT '自增主键',
    CODE               VARCHAR(8)    NOT NULL DEFAULT '' COMMENT '股票代码',
    NAME               VARCHAR(128)  NOT NULL DEFAULT '' COMMENT '股票名称',
    IMPL_PLAN_PROFILE  VARCHAR(128)  NOT NULL DEFAULT '' COMMENT '分配方案预案',
    EQUITY_RECORD_DATE DATETIME COMMENT '股权登记日',
    EX_DIVIDEND_DATE   DATETIME COMMENT '除权除息日',
    NOTICE_DATE        DATETIME COMMENT '最新公告日期',
    PLAN_NOTICE_DATE   DATETIME COMMENT '预案公告日',
    PRETAX_BONUS_RMB   DECIMAL(6, 2) NOT NULL DEFAULT 0 COMMENT '分红金额',
    AFTERTAX_BONUS_RMB DECIMAL(6, 2) NOT NULL DEFAULT 0 COMMENT '税后分红金额',
    BASE_SHARE         INT(4) NOT NULL DEFAULT 0 COMMENT '基础股数（一般是10股）',
    HANDSEL            DECIMAL(6, 2) NOT NULL DEFAULT 0 COMMENT '送',
    TRANSFER           DECIMAL(6, 2) NOT NULL DEFAULT 0 COMMENT '转',
    GMT_CREATE         DATETIME               DEFAULT CURRENT_TIMESTAMP,
    GMT_MODIFIED       DATETIME               DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (ID),
    UNIQUE INDEX `UNQ_STOCK_DIVIDEND_CODE_RECORD`(`CODE`, `EQUITY_RECORD_DATE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 comment='股票分红记录表';

-- 失败需要重试的记录
drop table if exists fail_retry_record;
create table fail_retry_record
(
    ID           BIGINT(16) AUTO_INCREMENT COMMENT '自增主键',
    CODE         VARCHAR(8)   NOT NULL DEFAULT '' COMMENT '股票代码',
    NAME         VARCHAR(128) NOT NULL DEFAULT '' COMMENT '股票名称',
    TRADING_DATE VARCHAR(128) NOT NULL DEFAULT '' '交易日期（YYYY-MM-DD，多个日期逗号分隔）',
    FAIL_TYPE    VARCHAR(10)  NOT NULL DEFAULT '' COMMENT '失败类型',
    RETRY_SUCCES INT(2) NOT NULL DEFAULT 0 COMMENT '重试后成功（0:失败，1:成功）',
    GMT_CREATE   DATETIME              DEFAULT CURRENT_TIMESTAMP,
    GMT_MODIFIED DATETIME              DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (ID),
    INDEX        `INX_FAIL_RETRY_RECORD_CODE`(`CODE`, `RETRY_SUCCES`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 comment='失败需要重试的记录';
