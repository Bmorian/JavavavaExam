package sec10;

public class CalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result = 10 * 10 * Calculator.pi;
		System.out.println("�������� 10�� ���� �������� " + result + "�Դϴ�.");
		
		
		
		//10 + 5�� 10 - 5�� ����غ���   plus �޼ҵ�� minus�� ���
		
		
		//10 * 5�� ����غ���              multiply �޼ҵ带 ���
		
		
		int result2 =Calculator.plus(10, 5);
		System.out.println("10 + 5��? " +result2);
		
		
		int result3 = Calculator.minus(10, 5);
		System.out.println(result3);
		
		
		
		
		Calculator cal = new Calculator();
		int result4 = cal.multiply(10, 5);
		System.out.println(result4);
		
		
		//�ν��Ͻ��� ��ü�� �Ҽӵ� ����� ���ο� �޼ҵ带 ���� ����ؾ� �Ѵ�
		//������ Ŭ������ �Ҽӵ� ����� ��𼭵� �̸��� �Ἥ ����� �� �ִ�.
	}

}
