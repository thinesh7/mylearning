package com.learn.service;

public interface AccountService {

	void callMe();

	/*
	 * Description:
	 * 
	 * Field accServ in com.learn.controller.MyRestController required a single
	 * bean, but 2 were found: - ser: defined in file [G:\A_Java\Z_Java
	 * FrameWork\Spring-2022-Practice\practice-3-Interview\SpringBoot-REST\target\
	 * classes\com\learn\service\CurrentAccountServiceImpl.class] - serr: defined in
	 * file [G:\A_Java\Z_Java
	 * FrameWork\Spring-2022-Practice\practice-3-Interview\SpringBoot-REST\target\
	 * classes\com\learn\service\SavingsAccountServiceImpl.class]
	 * 
	 * 
	 * Action:
	 * 
	 * Consider marking one of the beans as @Primary, updating the consumer to
	 * accept multiple beans, or using @Qualifier to identify the bean that should
	 * be consumed
	 * 
	 */
}
