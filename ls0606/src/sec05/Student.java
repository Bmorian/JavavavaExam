package sec05;

public class Student {

	//라이브러리 클라스
	
	
	//필드(생략 가능) -- 객체의 데이터가 저장되는 곳
	
	int age;
	String name;
	int grade;
	
	
	//생성자 -- 클라스 이름과 같은게 생성자 (생략 가능) ex) Student(){} -- 객체 생성 시 초기화 역할 담당
	Student(int age, String name, int grade){
		this.age = age;
		this.name = name;
		this.grade = grade;
	}
	
	
	
	//메소드(생략 가능) -- 객체의 동작으로 호출시 실행되는 곳
	public void study() {
		System.out.println("수업시간에는 공부를 열심히 합니다.");
	}
	public void home() {
		System.out.println("수업이 끝나면 집에 갑니다.");
	}
	
	
	
	
	
	
	
}
