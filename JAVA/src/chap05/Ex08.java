package chap05;

public class Ex08 {

	public static void main(String[] args) {
		int[][]array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;  //avg를 구하기 위해서는 항목의 sum 누적값 나누기 항목수가 필요함 그래서 count변수 초기화
		for(int i =0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
				
			}
		}
		avg =(double)sum /count;
		System.out.println("sum:"+ sum);
		System.out.println("avg"+ avg);

	}

}
