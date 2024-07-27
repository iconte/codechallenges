package br.com.icc.codechallenges;

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

	public static void main(String[] args) {
		System.out.println(BinaryGap.solution(328));
	}

}
