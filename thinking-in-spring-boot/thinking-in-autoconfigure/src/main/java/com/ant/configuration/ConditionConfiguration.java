package com.ant.configuration;


import com.ant.beans.AntBean;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * TODO
 * </P>
 *
 * @author Ant
 * @since 2022/11/06 12:52 上午
 **/
@Configuration
@ConditionalOnClass(name = "ss")
public class ConditionConfiguration {

	public ConditionConfiguration() {
		System.out.println("ConditionConfiguration construct....");
	}
}
