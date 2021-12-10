package aop11;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Pointcut("execution(public void aop11.*.runSomething())")
	public void impl() {
		
	}
	
	@Around("impl()")
	public void around(ProceedingJoinPoint jp) {
		System.out.println("문을 열고 집에 들어감");
		try {
			jp.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("문을 잠그고 나감");
	}
}
