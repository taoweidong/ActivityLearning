package com.taowd.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

/**
 * Activity初始化
 * @author taowd
 * @version 2019年10月11日
 * @see ActivityInit
 */
public class ActivityInit {

	/**
	 * 初始化activity数据库.
	 */
	@Test
	public void initDb() {

		ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration
				.createStandaloneProcessEngineConfiguration();
		processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
		processEngineConfiguration.setJdbcUrl(
				"jdbc:mysql://127.0.0.1:3306/activity_learning_db?useSSL=false&serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8");
		processEngineConfiguration.setJdbcUsername("root");
		processEngineConfiguration.setJdbcPassword("root");
		// 如果数据库表不存在就自动创建表
		processEngineConfiguration
				.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
		System.out.println("processEngine:" + processEngine);

	}

	/**
	 * 使用配置文件初始化activity数据库.
	 */
	@Test
	public void initDbByConfig() {

		ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResource("activiti.cfg.xml");

		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
		System.out.println("配置文件初始化 processEngine:" + processEngine);

	}

}
