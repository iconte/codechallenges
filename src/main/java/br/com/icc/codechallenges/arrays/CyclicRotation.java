package br.com.icc.codechallenges.arrays;

import java.util.Arrays;

public class CyclicRotation {

	public static int[] solution(int[] A, int K) {
		
		if(A.length == 0 || A.length == K) {
			return A;
		}
		for (int i = 0; i < K; i++) {
			int lastValue = A[A.length - 1];

			for (int j = A.length - 2; j >= 0; j--) {
				A[j + 1] = A[j];
			}
			A[0] = lastValue;
			System.out.println(Arrays.toString(A));
		}
		
		return A;
	}
	
	  public static int[] solution2(int[] A, int K) {
	        int len = A.length;

	        for(int i=0; i<K; i++) {
	            int[] copy = A.clone();

	           for(int j = 0; j<len; j++){
	               A[0] = copy[len-1];
	               if(j>0){
	                   A[j] = copy[j-1];
	               }
	           }
	        }

	        return A;
	    }
	  
	  public static int[] solution3(int[] A, int K) {
	        int n = A.length;
	        if(n<=1 || K==n || K==0 || K%n == 0){
	            return A;
	        }

	        int[] res = new int [n];
	        if(K>n){
	            K = K%n;
	        }

	        for(int i =0; i<n;i++){
	            res[(i+K)%n] = A[i];
	            System.out.println(Arrays.toString(res));
	        }
	        
	        return res;
	    }

	public static void main(String[] args) {
//		CyclicRotation.solution3(new int[] { 1, 2, 3, 4 }, 9);
		System.out.println(Arrays.toString(CyclicRotation.solution(new int[] { 1, 2, 3, 4 }, 4)));

	}

}
/**
 * 
 * @author icc
 * 
 *         An array A consisting of N integers is given. Rotation of the array
 *         means that each element is shifted right by one index, and the last
 *         element of the array is moved to the first place. For example, the
 *         rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements
 *         are shifted right by one index and 6 is moved to the first place).
 * 
 *         The goal is to rotate array A K times; that is, each element of A
 *         will be shifted to the right K times.
 * 
 *         Write a function:
 * 
 *         class Solution { public int[] solution(int[] A, int K); }
 * 
 *         that, given an array A consisting of N integers and an integer K,
 *         returns the array A rotated K times.
 * 
 *         For example, given
 * 
 *         A = [3, 8, 9, 7, 6] K = 3 the function should return [9, 7, 6, 3, 8].
 *         Three rotations were made:
 * 
 *         [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7] [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 *         [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8] For another example, given
 * 
 *         A = [0, 0, 0] K = 1 the function should return [0, 0, 0]
 * 
 *         Given
 * 
 *         A = [1, 2, 3, 4] K = 4 the function should return [1, 2, 3, 4]
 * 
 *         Assume that:
 * 
 *         N and K are integers within the range [0..100]; each element of array
 *         A is an integer within the range [−1,000..1,000]. In your solution,
 *         focus on correctness. The performance of your solution will not be
 *         the focus of the assessment.
 * 
 * 
 *
 */