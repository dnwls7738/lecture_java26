package start;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result;
		
		for(int i = 2; i<=9; i++) {
			
			System.out.println("[구구단"+ i + "단]");
			
			for(int j =1; j<=9; j++) {
				result = i * j;
				System.out.println(i +" X " + j + " = " + result);
			}
			
		}
		
		sc.close();
	}

}
