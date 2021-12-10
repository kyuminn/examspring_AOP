package aop01;

public class Start {
	public static void main(String[] args) {
		// aop01은 스프링의 aop를 사용하지 않은 상태
		Boy romeo = new Boy();
		Girl juliet = new Girl();
		
		romeo.runSomething();
		System.out.println();
		juliet.runSomething();
	}
}
