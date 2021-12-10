package aop13;

public class Boy implements Person{
	public void runSomething() {
	// 핵심기능만 남게 하고 공통기능은 따로 뺀다
	System.out.println("컴퓨터로 게임을 한다");
	
	// 임의로 아무 예외나 던짐
	throw new NumberFormatException("불남");
	}
	

}
