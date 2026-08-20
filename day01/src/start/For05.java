package start;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int positive;
		int sum = 0;
		System.out.print("양의 숫자를 입력하세요 : ");
		
		while(true) {   // 양수 값을 받을 때까지 반복
			
			positive = sc.nextInt();  // 값 입력
			
			if(positive > 0) {
				break; // 입력값이 양수 이면 while문 빠져나오기
				
			}else if(positive < 0){
				System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : "); // 음수 값 일때 출력후 positive = sc.nextInt();가 양수 일때까지 반복
			}
			
		}
		
		for(int i = 1; i <= positive; i++) {
			sum += i; //  1부터 입력값까지 다 더해주기
		}
		
		System.out.println("1부터 " + positive + "까지의 합: " + sum);
		
		sc.close();
	}

}
