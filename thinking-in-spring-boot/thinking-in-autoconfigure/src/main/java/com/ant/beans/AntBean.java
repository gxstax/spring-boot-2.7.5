package com.ant.beans;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

/**
 * <p>
 * TODO
 * </P>
 *
 * @author Ant
 * @since 2022/11/06 12:29 上午
 **/
public class AntBean {

	private String name;

	public AntBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AntBean{" +
				"name='" + name + '\'' +
				'}';
	}
}
