package codeforces.p800.oct;

import java.util.Scanner;

/*
 * time - O(1)
 * space - O(1)
 * 
 */
public class WordOnPaper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		while (t-- > 0) {
			char[][] grid = new char[8][8];
			for (int i = 0; i < 8; i++) {
				grid[i] = scanner.next().toCharArray();
			}

			StringBuilder verticalWord = new StringBuilder();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (grid[i][j] != '.') {
						verticalWord.append(grid[i][j]);
					}
				}
			}
			System.out.println(verticalWord.toString());
		}
	}
}
