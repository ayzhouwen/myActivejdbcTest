package com.zw.service;


import cn.hutool.extra.spring.SpringUtil;
import com.zw.db.service.StockService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = {"com.zw"})//, exclude = {DataSourceAutoConfiguration.class})
@EnableAsync
public class MyActivejdbcTest {
    public static void main(String[] args) {
        SpringApplication.run(MyActivejdbcTest.class, args);
        StockService service= SpringUtil.getBean(StockService.class);
        service.addStock();
    }
}