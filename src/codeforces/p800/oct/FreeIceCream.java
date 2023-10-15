package codeforces.p800.oct;

import java.util.Scanner;

//O(1)
public class FreeIceCream {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long t = s.nextInt();
		long n = s.nextInt();
		long numDistress = 0;
		long remIce = n;
		while (t-- > 0) {
			char c = s.next().charAt(0);
			long e = s.nextInt();
			if (c == '+') {
				remIce += e;
			} else if (e <= remIce) {
				remIce -= e;
			} else {
				numDistress++;
			}
		}
		System.out.println(remIce + " " + numDistress);
	}
}
