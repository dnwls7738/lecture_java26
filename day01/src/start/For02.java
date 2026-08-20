package start;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			sum += num;
		}
		
		System.out.println("5개 정수의 합은" + sum);
		sc.close();
	}

}
