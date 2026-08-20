package start;

import java.util.Scanner;

public class Star05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num을 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num*2; i+=2) {
			
			for(int j = num*2-1; j>i; j-=2) {
				System.out.print(" ");
			}

			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}
