package com.learn.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

import com.learn.bean.MyTestBean;

@Configuration
public class MySpringConfiguration {

	@Bean("SingleBean")
	@Scope(scopeName = "singleton")
	public MyTestBean getMyTestBean1() {
		return new MyTestBean();
	}

	@Bean("prototypeBean")
	@Scope(scopeName = "prototype")
	public MyTestBean getMyTestBean2() {
		return new MyTestBean();
	}

	@Bean("requestBean")
	@Scope(scopeName = "request")
	public MyTestBean getMyTestBean3() {
		return new MyTestBean();
	}

	@Bean("sessionBean")
	@Scope(scopeName = "session")
	public MyTestBean getMyTestBean4() {
		return new MyTestBean();
	}

	@Bean
	public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
		return (beanFactory) -> {
			BeanDefinition bean = beanFactory.getBeanDefinition(
					DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
			bean.getPropertyValues().add("loadOnStartup", 1);
		};
	}

	@Bean(name = "restTemplate")
	public RestTemplate getRestTemplateInstance() {
		return new RestTemplate();
	}

	/*
	 * globalSession is something that is connected to Portlet applications. When
	 * your application works in a Portlet container it is built of some amount of
	 * portlets. Each portlet has its own session, but if you want to store
	 * variables global for all portlets in your application then you should store
	 * them in globalSession. This scope doesn't have any special effect different
	 * from the session scope in Servlet based applications.
	 */

}
