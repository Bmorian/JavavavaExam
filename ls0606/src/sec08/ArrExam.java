package sec08;

public class ArrExam {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//�ʵ� ����
	//������ �⺻
		
		//�޼ҵ�
		
		//1���� 10���� ���� ������
		
		ArrMethod arrs = new ArrMethod();
		
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int rs = arrs.sum(nums);
	    
		System.out.println("1���� 10������ ���� : " + rs);
		
		int rs2 = arrs.sum2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("1���� 10������ ���� : " + rs2);
		
	}

}