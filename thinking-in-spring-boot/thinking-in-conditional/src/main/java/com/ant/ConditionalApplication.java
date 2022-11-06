package com.ant;


import com.ant.beans.AntBean;
import com.ant.beans.EmptyBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <p>
 * 条件注入应用
 * </P>
 *
 * @author Ant
 * @since 2022/11/06 3:20 上午
 **/
@SpringBootApplication
public class ConditionalApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConditionalApplication.class, args);
		context.getBeanFactory().registerSingleton("afterRefresh", new AntBean("AfterRefresh"));

		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(EmptyBean.class);
		((DefaultListableBeanFactory) context.getBeanFactory())
				.registerBeanDefinition("afterRefreshByBeanDefinition", beanDefinition);

		System.out.println(context.getBean("afterRefresh"));
		System.out.println(context.getBean("afterRefreshByBeanDefinition"));
	}
}
