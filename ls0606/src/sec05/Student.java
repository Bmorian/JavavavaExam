package sec05;

public class Student {

	//���̺귯�� Ŭ��
	
	
	//�ʵ�(���� ����) -- ��ü�� �����Ͱ� ����Ǵ� ��
	
	int age;
	String name;
	int grade;
	
	
	//������ -- Ŭ�� �̸��� ������ ������ (���� ����) ex) Student(){} -- ��ü ���� �� �ʱ�ȭ ���� ���
	Student(int age, String name, int grade){
		this.age = age;
		this.name = name;
		this.grade = grade;
	}
	
	
	
	//�޼ҵ�(���� ����) -- ��ü�� �������� ȣ��� ����Ǵ� ��
	public void study() {
		System.out.println("�����ð����� ���θ� ������ �մϴ�.");
	}
	public void home() {
		System.out.println("������ ������ ���� ���ϴ�.");
	}
	
	
	
	
	
	
	
}
