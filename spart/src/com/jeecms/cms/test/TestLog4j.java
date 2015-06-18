package com.jeecms.cms.test;

import org.apache.log4j.Logger;

public class TestLog4j {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Logger logger = Logger.getLogger(TestLog4j.class);
		
		logger.debug(" debug ");		 
		
		System.out.println("日志文件保存在 E:/webapps/zl/logs/system.log下面");
		
		
	}

}
