package sec06;

public class Cal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator2 cal = new Calculator2();
		
		//리턴값이 없는 메소드 호출
		cal.powerOn();
		
		int rs = cal.plus(143, 145);
		System.out.println("143 + 145 = " + rs);
		
		double re2 = cal.divide(120,15);
		System.out.println("120 / 15 =  + re2");
		
		cal.powerOff();
		
		cal.autoCalculator(111, 10);
		
		
	}

}
