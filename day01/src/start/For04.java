package start;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int result = 1; // 0일때는 무엇을 곱해도 0
		
		for(int i=1; i <= num; i++) {
			result *= i; // result = result * i
		}
		
		System.out.println(num+"! = " + result);
		sc.close();
	}

}
