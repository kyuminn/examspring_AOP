package aop05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class MyAspect {
	

	@Before("execution(public void aop05.*.runSomething()) ")
	public void open(JoinPoint jp) {
		System.out.println("문을 열고 집에 들어감");
	}
	
	@After("execution(public void aop05.*.runSomething())")
	public void lockDoor(JoinPoint jp) {
		System.out.println("문을 잠그거 나감");
	}
}
