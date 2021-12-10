package aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//공통기능을 정의하는 클래스에 @Aspect annotation 붙여주기
@Aspect
public class MyAspect {
	
	// aop02 패키지의 모든 클래스의 , public void runSomethoing method에 대해! 라는 뜻
	@Before("execution(public void aop02.*.runSomething()) ")
	public void open(JoinPoint jp) {
		//JoinPoint : 자르고 들어간 포인트에 대한 정보를 알 수 있음!
		System.out.println(jp.getTarget());
		System.out.println(jp.getSignature());
		//runSomething으로 넘어온 parameter 에 대한 처리
		//지금은 매게변수 없으니 0으로 나옴
		Object[] args = jp.getArgs();
		System.out.println(args.length);
		for (Object o : args) {
			System.out.println(o);
		}
		//JoinPoint : 메서드 호출 시점!!에 끼어들어 갈 수 있는 지점
		System.out.println("문을 열고 집에 들어감");
	}
}
