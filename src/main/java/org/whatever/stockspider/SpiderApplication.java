package org.whatever.stockspider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 程序启动入口
 */
@MapperScan(basePackages = {"org.whatever.stockspider.db"}, sqlSessionTemplateRef = "sqlSessionTemplate")
@SpringBootApplication
@EnableScheduling
@EnableAsync
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiderApplication.class, args);
    }

}
