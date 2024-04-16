package org.whatever.stockspider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Aaron
 * @date 2020/11/25
 * <p>
 * 程序启动入口
 */
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class SpiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiderApplication.class, args);
    }

}
