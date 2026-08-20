package start;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("금액 입력 : ");
			
			int cost = sc.nextInt();
			
			int a = cost / 500;
			
			int b = (cost % 500) / 100;
			
			System.out.println("500원 :" + a +"개");
			System.out.println("100원 :" + b +"개");
		sc.close();

	}

}
