package br.com.icc.codechallenges.easy;

import java.util.ArrayList;

public class Alternates {

	public static void main(String[] args) {
			
	}

	public ArrayList<Integer> getAlternates(int arr[]) {
		// Code Here
		final ArrayList<Integer> alt = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				alt.add(arr[i]);
			}
		}
		return alt;
	}
}
