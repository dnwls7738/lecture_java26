package start;

import java.util.Arrays;

public class SwapArray {

	static int[] swapArray(int[] numList) {

		for (int i = 0; i < numList.length / 2; i++) {
			int result = numList[i];
			numList[i] = numList[numList.length - i - 1];
			numList[numList.length - i - 1] = result;

		}

		for (int i = 0; i < numList.length; i++) {
			System.out.print(numList[i] + " ");
		}

		return numList;
	}

	public static void main(String[] args) {

		int[] numList = { 1, 2, 3, 4 };

		swapArray(numList);
	}

}
