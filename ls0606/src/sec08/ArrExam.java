package sec08;

public class ArrExam {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//필드 생략
	//생성자 기본
		
		//메소드
		
		//1부터 10까지 더해 보세요
		
		ArrMethod arrs = new ArrMethod();
		
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int rs = arrs.sum(nums);
	    
		System.out.println("1부터 10까지의 합은 : " + rs);
		
		int rs2 = arrs.sum2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("1부터 10까지의 합은 : " + rs2);
		
	}

}
