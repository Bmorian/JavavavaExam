package sec10;

public class CalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result = 10 * 10 * Calculator.pi;
		System.out.println("반지름이 10인 원의 원주율은 " + result + "입니다.");
		
		
		
		//10 + 5와 10 - 5를 출력해보자   plus 메소드와 minus를 출력
		
		
		//10 * 5도 출력해보자              multiply 메소드를 출력
		
		
		int result2 =Calculator.plus(10, 5);
		System.out.println("10 + 5는? " +result2);
		
		
		int result3 = Calculator.minus(10, 5);
		System.out.println(result3);
		
		
		
		
		Calculator cal = new Calculator();
		int result4 = cal.multiply(10, 5);
		System.out.println(result4);
		
		
		//인스턴스는 객체에 소속된 멤버라서 새로운 메소드를 만들어서 사용해야 한다
		//정적은 클래스에 소속된 멤버라서 어디서든 이름을 써서 사용할 수 있다.
	}

}
