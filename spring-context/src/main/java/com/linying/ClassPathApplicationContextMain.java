package com.linying;

import com.linying.base.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author brucekellan
 */
public class ClassPathApplicationContextMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/linying/applicationContext.xml");
		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.send();
		context.close();
	}

}
