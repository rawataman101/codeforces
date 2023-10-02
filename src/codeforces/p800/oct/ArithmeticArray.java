package codeforces.p800.oct;

import java.util.Scanner;

public class ArithmeticArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println(sol(arr, n));
		}
	}

	// O(n)
	private static int sol(int[] arr, int n) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		if (sum == n) {
			return 0;
		} else if (sum < n) {
			return 1;
		} else {
			return sum - n;
		}

	}
}