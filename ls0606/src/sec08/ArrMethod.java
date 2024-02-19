package sec08;

public class ArrMethod {

	int[] arr = { 3, 5, 7, 9 };
	
	int sum(int[] arrs){
		int sum = 0;
		
		for(int i = 0; i < arrs.length; i++) {
			sum += arrs[i];
		}
		
		return sum;
	}
	
	//가변길이 매개변수를 이용하는 메소드
	int sum2(int ... arrs) {
		int sum = 0;
		
		for(int i = 0; i < arrs.length; i++) {
			sum += arrs[i];
		}
		
		return sum;
	}
	
	
	
}
