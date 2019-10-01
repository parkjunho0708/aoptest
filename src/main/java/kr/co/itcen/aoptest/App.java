package kr.co.itcen.aoptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// Container가 하나생성되었다가 사라짐.
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("config/applicationContext.xml");
		
		ProductService ps =  ac.getBean(ProductService.class);
		ProductVo vo = ps.find("TV");
		System.out.println("---- App Main Method ----");
		System.out.println(vo);
		
		((ConfigurableApplicationContext)ac).close();
	}
}
