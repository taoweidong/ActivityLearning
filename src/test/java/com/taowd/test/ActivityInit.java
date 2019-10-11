package com.taowd.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

/**
 * Activity��ʼ��
 * @author taowd
 * @version 2019��10��11��
 * @see ActivityInit
 */
public class ActivityInit {

	/**
	 * ��ʼ��activity���ݿ�.
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
		// ������ݿ�����ھ��Զ�������
		processEngineConfiguration
				.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
		System.out.println("processEngine:" + processEngine);

	}

	/**
	 * ʹ�������ļ���ʼ��activity���ݿ�.
	 */
	@Test
	public void initDbByConfig() {

		ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResource("activiti.cfg.xml");

		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
		System.out.println("�����ļ���ʼ�� processEngine:" + processEngine);

	}

}
