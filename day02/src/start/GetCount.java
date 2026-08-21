package start;

import java.util.Scanner;

public class GetCount {

	static void getCount(int[] numList, int num) {
		int max = 0;
		for (int i = 0; i < numList.length; i++) {
			if (num < numList[i]) {
				max += 1;

			}
		}
		System.out.println("가장 큰 수는 " + max + "개 입니다.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();

		int[] numList = { 1, 2, 3 };
		getCount(numList, num);
		
		sc.close();

	}

}
