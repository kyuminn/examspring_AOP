package aop07;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void before(JoinPoint joinPoint) {
		System.out.println("문을 열고 집에 들어감");
	}
	
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("문을 잠그고 나감");
	}
}
