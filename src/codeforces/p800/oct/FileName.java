package codeforces.p800.oct;

import java.util.Scanner;

// O(n)
public class FileName {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = s.next();
		int count = 0;
		if (n > 2) {
			for (int i = 2; i < n; i++) {
				if (str.charAt(i) == 'x') {
					if (str.charAt(i - 1) == 'x' && str.charAt(i - 2) == 'x') {
						count++;
					}
				}
			}
			System.out.println(count);
		} else {
			System.out.println(count);
		}
	}
}
