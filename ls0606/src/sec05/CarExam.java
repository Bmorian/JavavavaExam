package sec05;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Car ��ü ���� 
		Car myCar = new Car();
		
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("�õ����� : " + myCar.start);
		System.out.println("���� �ӵ� " + myCar.speed);
		
		
		
		
		
		//Car ��ü�� �ʵ尪 ����
		
		myCar.speed = 60;
		System.out.println("������ �ӵ� : " + myCar.speed);
		
		
		
		
	}

}