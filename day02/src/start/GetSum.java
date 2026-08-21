package start;

public class GetSum {

	static int getSum(int[] numList) {
		int sum = 0;
		for (int i = 0; i < numList.length; i++) {
			sum += numList[i];
		}
		return sum;

	}

	public static void main(String[] args) {

		int[] numList = { 1, 3, 3 };
		System.out.println(getSum(numList));
	}

}
