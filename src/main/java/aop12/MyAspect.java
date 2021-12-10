package aop12;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Pointcut("execution(public void aop12.*.runSomething())")
	public void impl() {
		
	}
	
	@Before("impl()")
	public void before(JoinPoint jp) {
		System.out.println("문을 열고 집에 들어감");
	}
	
	@Around("impl()")
	public void around(ProceedingJoinPoint jp) {
		System.out.println("밥을 먹는다");
		try {
			jp.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("씻는다");
	}
	
	@After("impl()")
	public void lockDoor(JoinPoint jp) {
		System.out.println("문을 잠그고 나감");
	}
	
	// 핵심 메서드 정상 종료 후 동작
	@AfterReturning("impl()")
	public void afterReturning(JoinPoint joinPoint) {
		System.out.println("게임 종료");
	}
}
