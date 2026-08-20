package start;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		int num = sc.nextInt();
		
		String even = "짝수입니다.";
		String odd = "홀수입니다.";
		
		if(num % 2 == 0) {
			System.out.println(even);
		}else {
			System.out.println(odd);
		}
		sc.close();
	}
	
}
