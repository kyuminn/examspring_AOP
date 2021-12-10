package aop08_around;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop08.xml");
		
		Person romeo = ctx.getBean("boy", Person.class);
		romeo.runSomething();
		System.out.println();
		Person juliet = ctx.getBean("girl", Person.class);
		juliet.runSomething();
		
		ctx.close();
	}
}
