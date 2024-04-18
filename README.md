# StockSpider 股票数据爬虫

# 1. 项目介绍

爬取A股所有股票的公司和价格数据

## 1.1 技术框架

* 基于WebMagic-0.7.3开源框架实现爬虫
* 基于SpringBoot-2.7.13
* 数据存储在mysql

## 1.2 功能介绍

* 支持爬取A股所有股票的价格数据
* 支持爬取A股所有公司信息
* 支持A股所有股票价格数据每天更新

## 1.3 数据支持

* 所有数据基于东方财富网站

# 2. 使用说明

## 2.1 数据库

* 建库脚本在 data 目录下
* 最新的股票代码及公司信息是 2024-04-18 的

## 2.2 初次使用

### 2.2.1 使用现有的股票代码数据

1. 使用 NewStockSpider 爬新股（提示：修改每页读取的新股数一次把需要的新股读出来）
2. 调用 CompanyInfoSpider.run() 更新新股股票的公司信息
3. 调用 StockHisPriceSpider.run() 爬取新股的历史价格数据（提示：需要修改取新股的查询条件）
4. 更新完上面数据后，每天按 SpiderRunner 的定时任务跑就行，会定时更新新股和每天的股票价格

### 2.2.2 数据全部重新生成

1. StockCodeSpider.run() 爬取所有股票代码信息
2. CompanyInfoSpider.run() 更新所有股票的公司信息
3. StockHisPriceSpider.run() 爬取所有股票的历史价格数据
4. 更新完上面数据后，每天按 SpiderRunner 的定时任务跑就行，会定时更新新股和每天的股票价格

# 3.感谢

1. 本项目启发于[box-spider](https://github.com/Laichj/box-spider) 
