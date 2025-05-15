package br.com.icc.codechallenges.easy;

public class SecondLargest {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 40, 50, 25, 25 };
		System.out.println(getSecondLargest(array));
	}

	public static int getSecondLargest(int[] arr) {
		// code here
		int first = -1;
		int second = -1;
		int tam = arr.length;
		if (tam < 2) {
			return second;
		}

		for (int i = 0; i < tam; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}
			if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}

		return second;

	}

}
