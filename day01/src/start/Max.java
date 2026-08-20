package start;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세개의 정수를 입력하세요 :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		
		if(max < b) {
			max= b;
		}
		
		if(b<c) {
			max = c;
		}
		
		System.out.println(max);
		sc.close();
	}

}
