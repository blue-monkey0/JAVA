package sec04;
// 클래스로부터 객체 생성     // 실행 클래스!
public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(); // 클래스 변수 = new 클래스();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
