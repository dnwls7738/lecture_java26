package start;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("a 값 입력 :");
			int a = sc.nextInt();
			
			System.out.print("b 값 입력 :");
			int b = sc.nextInt();
			
			System.out.println("a = "+ a + ","+ "b = " + b);
			
			int temp = a;  // temp 변수에 a 입력값 할당
			a = b;			// 비어있는 a 변수에 b 입력값 할당
			b = temp;		// 비어있는 b 변수에 temp 값 할당
			
			System.out.print( "Swapping 결과 " + "a = "+ a + ","+ "b = " + b);
			sc.close();
		}
	}

}
