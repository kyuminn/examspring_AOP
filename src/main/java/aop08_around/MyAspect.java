package aop08_around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
	
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
