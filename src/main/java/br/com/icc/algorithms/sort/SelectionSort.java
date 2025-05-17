package br.com.icc.algorithms.sort;

import java.util.Arrays;

public class SelectionSort {

	public static String sort(int[] arr) {

		int size = arr.length - 1;

		for (int lastUnsortedIndex = size; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			int largest= 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				int curr= i;
				int next= i+1;
				if (arr[curr] > arr[largest]) {
					largest=curr;
					System.out.println(String.format("trocando %d por %d" , arr[curr],arr[next]));
					
				}
				swap(arr, curr, lastUnsortedIndex);

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
