package start;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int sum = 0;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			sum +=num;
			
		} while(num != 0);
		
		System.out.println("지금까지 입력한 숫자의 합은 " + sum +" 입니다.");
		sc.close();

	}

}
