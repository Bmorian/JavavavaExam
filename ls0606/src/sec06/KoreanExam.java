package sec06;

public class KoreanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Korean k1 = new Korean("��ö��", "123434-123421", 65);
		Korean k2 = new Korean("�̿���", "423212-452211", 40);
		
		
		System.out.println("���� : " +k1.nation);
		System.out.println(k1.name+", " + k1.age + "��, " + k1.ssn);
		
		System.out.println("���� : " +k2.nation);
		System.out.println(k2.name+", " + k2.age + "��, " + k2.ssn);
		
		
		
		
	}

}
