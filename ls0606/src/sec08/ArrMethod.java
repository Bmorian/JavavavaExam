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
	
	//�������� �Ű������� �̿��ϴ� �޼ҵ�
	int sum2(int ... arrs) {
		int sum = 0;
		
		for(int i = 0; i < arrs.length; i++) {
			sum += arrs[i];
		}
		
		return sum;
	}
	
	
	
}