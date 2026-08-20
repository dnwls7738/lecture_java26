package start;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
	
		int num = input % 2;
		
		String even = "짝수입니다.";
		String odd = "홀수입니다.";
		
		switch(num) {
			case 0 :
				System.out.println(even);
				break;
			case 1 :
				System.out.println(odd);
				break;
		}
		sc.close();
	}

}
