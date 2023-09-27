package codeforces.p800.sep;

import java.util.Scanner;

public class LinearKeyboard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String latin = s.next();
			String word = s.next();
			sol(word, latin);
		}
	}

	// O(n)
	private static void sol(String word, String latin) {
		int ans = 0;
		for (int i = 1; i < word.length(); i++) {
			int index2 = latin.indexOf(word.charAt(i)) + 1;
			int index1 = latin.indexOf(word.charAt(i - 1)) + 1;

			ans += Math.abs(index2 - index1);
		}
		System.out.println(ans);

	}

}
