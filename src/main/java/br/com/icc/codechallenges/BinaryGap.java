package br.com.icc.codechallenges;


public class BinaryGap {
	/**
	 * 
	 * @param N
	 * @return
	 */
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
/**
 * 
 * @author icc
 * 
 * 		A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

		For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. 
		The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
		
		Write a function:
		
		class Solution { public int solution(int N); }
		
		that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
		
		For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. 
		Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
		
		Write an efficient algorithm for the following assumptions:
		
		N is an integer within the range [1..2,147,483,647].
 * 
 *
 */
