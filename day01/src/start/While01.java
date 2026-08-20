package start;

import java.util.Scanner;

public class While01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = 1;
		
		while(num != 0) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			sum += num;

		}

		System.out.print("입력한 숫자의 합은 : " + sum);
		sc.close();
	}

}
