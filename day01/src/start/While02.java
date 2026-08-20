package start;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		while(num != 0) {
			System.out.print("숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input % 2 == 0) {
				System.out.println("짝수 입니다.");
				input = 0;
			}else {
				System.out.println("홀수 입니다.");
				input = 0;
			}
			System.out.println("계속하시겠습니까?");
			num = sc.nextInt();
		}
		
		System.out.println("끝");
		sc.close();
	}

}
