package sec04;
// 문자열 연결 연산자
public class StringConcatExample {

	public static void main(String[] args) {
	String str1 = "JDK" + 6.0;
	String str2 = str1 + "특징";
	System.out.println(str2);
	
	String str3 = "JDK" + 3 + 3.0;
	String str4 = 3 + 3.0 + "JDK";
	System.out.println(str3);
	System.out.println(str4);
		// 왼쪽에서 -> 오른쪽으로 연산되기에 순서 주의할 것. 순서에 따라 다른 값이 출력 됨!! 
	}

}
