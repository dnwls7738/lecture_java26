package start;

public class GetMax {

	static void getMax(int[] numList) {
		int max = numList[0];
		for (int i = 0; i < numList.length; i++) {
			if (max < numList[i]) {
				max = numList[i];
			}
		}

		System.out.println(max);

	}

	public static void main(String[] args) {
		int[] numList = { 1, 4, 3 };
		getMax(numList);
	}

}
