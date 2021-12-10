package aop01;

public class Start {
	public static void main(String[] args) {
		// aop01은 스프링의 aop를 사용하지 않은 상태
		Boy romeo = new Boy();
		Girl juliet = new Girl();
		
		romeo.runSomething();
		System.out.println();
		juliet.runSomething();
		/*
문을 열고 집에 들어감
컴퓨터로 게임을 한다
불을 끄고 잔다
문을 잠그고 집에서 나옴

문을 열고 집에 들어감
요리를 한다
불을 끄고 잔다
문을 잠그고 집에서 나옴

핵심기능 컴퓨터/요리  나머지는 공통기능!
 
		 	*/
	}
}
