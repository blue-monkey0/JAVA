package sec03;
// 1부터 100까지 합을 출력
public class WhileSume1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {		// while(조건식)  그다음 실행문 
			sum+= i;
			i++;
		}
		System.out.println("1~100 합: " + sum);
	}

}
