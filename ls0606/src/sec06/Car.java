package sec06;

public class Car {

	/*
	 * �Ű������� ��ü�� �ʵ带 �پ��ϰ� �ʱ�ȭ �ϴ� �� - �����ε� Overloading
	 * �Ű������� �޸��ϴ� �����ڸ� ������ �����ϴ� ���� '�����ڿ����ε�'�̶�� �Ѵ�
	 * �Ű������� ������ ���� ���� Ÿ���� �޶�� �ϰ� �ƴϸ� �Ű������� ������ �޶�� �Ѵ�.
	 * */
	
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car(){
		this.model = "�׷���";
		this.color = "����";
		this.maxSpeed = 300;
	}
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	
	//�޼ҵ�
	
	//�����ڸ� ������ �ʵ带 �ʱ�ȭ �� �� �ִ�...?
	
	
	//Ÿ���� �ٲ�� �����ڿ����ε� ����

	
	
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
