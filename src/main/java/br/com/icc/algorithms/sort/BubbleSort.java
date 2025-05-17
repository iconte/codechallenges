package br.com.icc.algorithms.sort;

import java.util.Arrays;

public class BubbleSort {

	public static String sort(int[] arr) {

		int size = arr.length - 1;

		for (int lastUnSortedIndex = size; lastUnSortedIndex > 0; lastUnSortedIndex--) {

			for (int i = 0; i < lastUnSortedIndex; i++) {
				int curr= i;
				int next= i+1;
				if (arr[curr] > arr[next]) {
					System.out.println(String.format("trocando %d por %d" , arr[curr],arr[next]));
					swap(arr, curr, next);
				}

			}

		}

		return Arrays.toString(arr);

	}

	private static void swap(int[] arr, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr =  { -2, 50, -90, -40, 5, 10, 38 };
		System.out.println(sort(arr));
	}

}
