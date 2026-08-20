package start;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.print("정수 값 입력 : ");
			int num = sc.nextInt();
			
			String a = "짝수";
			String b = "홀수";
			
			System.out.println(num % 2 == 0 ? a : b);
			sc.close();
		
	}

}
