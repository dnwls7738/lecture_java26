package start;

import java.util.Scanner;

public class Rectangle {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("가로 값 :");
			double w = sc.nextDouble();
			
			System.out.println("세로 값 :");
			double h = sc.nextDouble();
			
			double area = w * h;
			
			System.out.printf("area=%1.1f%n",area);
			sc.close();
		}
	}

}
