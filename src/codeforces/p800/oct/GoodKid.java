package codeforces.p800.oct;

import java.util.Scanner;

public class GoodKid {
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

	// O(n^2)
	// can be also done in O log n by sorting the array and adding 1 to arr[0] than output the product
	private static void sol(int[] arr, int n) {
		int maxProduct = 0;
		for (int i = 0; i < n; i++) {
			int product = arr[i] + 1;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				product *= arr[j];
			}
			maxProduct = Math.max(maxProduct, product);
		}
		System.out.println(maxProduct);
	}
}
