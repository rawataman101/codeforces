package codeforces.p800.oct;

import java.util.Scanner;

//O(1)
public class VusCossackContest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(a <= b && a <= c ? "YES" : "NO");
	}

}
