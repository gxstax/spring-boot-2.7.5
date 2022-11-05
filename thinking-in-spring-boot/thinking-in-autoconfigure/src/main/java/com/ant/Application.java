package com.ant;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 * 自动配置原理启动类
 * </P>
 *
 * @author Ant
 * @since 2022/11/05 10:14 下午
 **/
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println(context.getBean("demo"));
	}

	@Bean
	public String demo() {
		return "this is a String bean named demo";
	}
}
