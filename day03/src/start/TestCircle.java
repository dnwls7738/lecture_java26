package start;

import java.util.Scanner;

public class TestCircle {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		// 원의 반지름 입력
		System.out.print("원의 반지름 : ");
		double radius = sc.nextDouble();
		
		// 원의 객체 생성
		Circle c = new Circle(radius);
		
		// 원의 넓이 계산
		double area = c.getArea();
		System.out.println("반지름이"+radius+"인 원의 넓이는"+ area + "입니다.");
		
		sc.close();
	}

}
