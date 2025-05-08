package br.com.icc.codechallenges.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

		System.out.println(fizzBuzz(nums));

	}

	public static String fizzBuzz(List<Integer> nums) {
		List<String> res = new ArrayList<String>();
		if (nums == null) {
			return "";
		}

		for (Integer num : nums) {
			if (num % 3 == 0 && num % 5 == 0) {
				res.add("FizzBuzz");
			} else if (num % 5 == 0) {
				res.add("Buzz");
			} else if (num % 3 == 0) {
				res.add("Fizz");
			} else {
				res.add(num.toString());
			}
		}
		return res.toString();
	}
}
