package start;

import java.util.Scanner;

public class Circle {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("반지름 값 :");
			double r = sc.nextDouble();
			

			final double PI = 3.14;
			
			double area = r*r*PI;

			System.out.printf("원의 넓이는 %.2f 입니다.",area);

		}
	}

}
