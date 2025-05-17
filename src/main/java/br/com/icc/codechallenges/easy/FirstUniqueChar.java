package br.com.icc.codechallenges.easy;

public class FirstUniqueChar {

	public static void main(String[] args) {
		System.out.println(findFirstUniqueChar("aabbc")); // imprime 'c'
	}

	public static char findFirstUniqueChar(String str) {
		int[] count = new int[256]; // assume que os caracteres são ASCII
		char primeiro = '\0';

		// conta a frequência de cada caractere e encontra o primeiro que não se repete
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (count[c] == 0) {
				count[c]++;
				if (primeiro == '\0') {
					primeiro = c;
				}
			} else if (count[c] == 1) {
				count[c]++;
				if (primeiro == c) {
					primeiro = '\0';
				}
			}
		}

		return primeiro;
	}
}
