package aop06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop06.xml");
		
		Person romeo = ctx.getBean("boy", Person.class);
		Person juliet = ctx.getBean("girl", Person.class);
		romeo.runSomething();
		System.out.println();
		juliet.runSomething();
		

	}
}
