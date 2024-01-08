package Google.codeforces.jan;

import java.util.Scanner;

public class BlankSpace {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int si = s.nextInt();
			int arr[] = new int[si];
			for (int i = 0; i < si; i++) {
				arr[i] = s.nextInt();
			}
			sol(arr);
		}
	}

	private static void sol(int[] arr) {
		int maxx = 0;
		int count = 0;
		if (arr.length == 1 && arr[0] == 0) {
			System.out.println(1);
		} else {
			for (int i : arr) {
				if (i == 0) {
					count++;
				} else {
					maxx = Math.max(maxx, count);
					count = 0;
				}
			}
			System.out.println(Math.max(count, maxx));
		}
	}
}
