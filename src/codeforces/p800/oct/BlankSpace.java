package codeforces.p800.oct;

import java.util.Scanner;

public class BlankSpace {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			sol(arr, n);
		}
	}

//O(n)
	private static void sol(int[] arr, int n) {
		int count = 0;
		int max = 0;
		for (int i : arr) {
			if (i == 0) {
				count++;
			} else {
				count = 0;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
	}
}
