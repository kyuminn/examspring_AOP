package aop06;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class MyAspect {
	
	@Pointcut("execution(public void aop06.*.runSomething())")
	private void impl() {
		
	}
	

	@Before("impl()")
	public void open(JoinPoint jp) {
		System.out.println("문을 열고 집에 들어감");
	}
	
	@After("impl()")
	public void lockDoor(JoinPoint jp) {
		System.out.println("문을 잠그거 나감");
	}
}
