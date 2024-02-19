package sec05;

public class NahanTeWhy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	5.두 숫자 74와 36의 합을 출력하라.
		
		int num1 = 74;
		int num2 = 36;

		System.out.println(num1 + num2);
		

	//	6. 숫자50을 3으로 나누어 결과를 화면에 출력하라. 단 결과는 정수이다.

		int num3 = 50;
		
		System.out.println(num3 / 3);
		 

	//	7. 다음 결과를 출력하라.

	//	  1) -5 + 8 * 6
		
		int res1 = -5 + 8 * 6;
		System.out.println(res1);
		
	//	  2) (55 + 9) % 9

		int res2 = (55 + 9) % 9;
		System.out.println(res2);
		
	//	  3) 20 + 3*5/8
		
		int res3 = 20 + 3*5/8;
		System.out.println(res3);

	//	  4) 5+15/3*2-8%3

		int res4 = 5+15/3*2-8%3;
		System.out.println(res4);

	//	8. 구구단을 1부터 9까지 출력하라.    
		
		int x = 2;
		
		while(x <= 9) {
			System.out.println("\n\n***" + x + "단 ***");
			
			int y = 1;
			while(y <= 9) {
				System.out.println(x + "x" + y + "=" + (x*y));
				y++;
			}
			x++;
		}
		
		
		
		
		
		
		
		
	}

}
