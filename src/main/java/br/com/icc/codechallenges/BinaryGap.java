package br.com.icc.codechallenges;

import java.util.Iterator;

public class BinaryGap {

	public static int solution(int N) {
		// Implement your solution here
		char[] seq = Integer.toBinaryString(N).toCharArray();
		System.out.println(seq);
		int inicio = -1;
		int fim = -1;
		int gapatual = 0;
		int gapmax = 0;
		for (int i = 0; i < seq.length; i++) {
			if (seq[i] == '1') {
				if (inicio == -1) {
					inicio = i;
				} else {

					fim = i;
					if (fim >= inicio) {
						gapatual = fim - inicio - 1;
					}

					inicio = i;
					fim = -1;
				}
			}
			if (gapatual > gapmax) {
				gapmax = gapatual;
			}

		}

		return gapmax;
	}
	
	public static int solution2(int N) {
		String bString = Integer.toBinaryString(N);
		boolean started= false;
		int counter=0;
		int maxCount=0;
		
		for (int i = 0; i < bString.length(); i++) {
			String c = bString.substring(i,i+1);
			if(c.equals("1")) {
				if(started) {
					if(counter> maxCount ) {
						maxCount = counter;
					}
				}
				counter =0;
				started=true;
			}
			if(c.equals("0")) {
				counter++;
			}
			
			
		}
		
		return maxCount;
	}

	public static void main(String[] args) {
		System.out.println(BinaryGap.solution(328));
		System.out.println(BinaryGap.solution2(328));
	}

}
