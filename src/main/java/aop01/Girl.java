package aop01;

public class Girl {
	public void runSomething() {
		System.out.println("문을 열고 집에 들어감");
		
		try {
			System.out.println("요리를 한다");
		}catch(Exception e) {
			if(e.getMessage().equals("불이야")) {
				System.out.println("119에 신고");
			}
		}finally {
			System.out.println("불을 끄고 잔다");
		}
		System.out.println("문을 잠그고 집에서 나옴");
	}
	

}
