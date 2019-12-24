package com.wb.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//配置Bean注解
@ComponentScan(basePackages = "com.wb")
@Import({JdbcConfig.class})//导入配置类
public class CreateConfiguration {

}
