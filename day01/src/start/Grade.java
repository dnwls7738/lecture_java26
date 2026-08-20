package start;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int grade = sc.nextInt();
		
		if(grade >= 90) {
			
			System.out.println("A등급 입니다.");
			
		}else if(grade >= 80) {
			
			System.out.println("B등급 입니다.");
			
		}else if(grade >= 70) {
			
			System.out.println("C등급 입니다.");
			
		}else if(grade >= 60) {
			
			System.out.println("D등급 입니다.");
			
		}else {
			
			System.out.println("F등급 입니다.");
		}
		sc.close();
	}

}
