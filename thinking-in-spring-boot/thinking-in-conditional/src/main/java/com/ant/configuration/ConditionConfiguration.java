package com.ant.configuration;


import com.ant.beans.AntBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * SpringBoot 条件注入
 * </P>
 *
 * @author Ant
 * @since 2022/11/06 3:17 上午
 **/
@Configuration
@ConditionalOnClass(AntBean.class)
//@ConditionalOnBean(name = "userService")
public class ConditionConfiguration {

	public ConditionConfiguration() {
		System.out.println("ConditionConfiguration construct....");
	}

	@Bean
	public AntBean antBean1() {
		return new AntBean("bean1");
	}

	@Bean
	public AntBean antBean2() {
		return new AntBean("bean2");
	}
}
