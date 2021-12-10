package aop09;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;


public class MyAspect {
	
	public void before(JoinPoint jp) {
		System.out.println("문을 열고 집에 들어감");
	}
	
	public void around(ProceedingJoinPoint jp) {
		System.out.println("밥을 먹는다");
		try {
			jp.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("씻는다");
	}
	
	public void lockDoor(JoinPoint jp) {
		System.out.println("문을 잠그고 나감");
	}
	
	// 핵심 메서드 정상 종료 후 동작
	public void afterReturning(JoinPoint joinPoint) {
		System.out.println("게임 종료");
	}
}
