package codeforces.p800.sep;

import java.util.Scanner;

//O(n)
public class TenWordsOfWisdom {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[][] arr = new int[n][2];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 2; j++) {
					arr[i][j] = s.nextInt();
				}
			}

			int max = 0;
			int qualityIndex = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i][0] <= 10) {
					if (max < arr[i][1]) {
						max = arr[i][1];
						qualityIndex = i;
					}
				}
			}
			System.out.println(qualityIndex + 1);
		}
	}

}
