package com.ant.beans;


/**
 * <p>
 * 示例 Bean
 * </P>
 *
 * @author Ant
 * @since 2022/11/06 3:18 上午
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
