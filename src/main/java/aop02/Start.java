package aop02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext 는 생성자 파라미터 값에 있는 classpath: 써주지 않고 바로 xml 파일 적어주면 된다
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop02.xml");
		
		Person romeo = ctx.getBean("boy", Person.class);
		Person juliet = ctx.getBean("girl", Person.class);
		romeo.runSomething();
		System.out.println();
		juliet.runSomething();
		
		//문을 열고 집에 들어감
		//컴퓨터로 게임을 한다
	}
}
