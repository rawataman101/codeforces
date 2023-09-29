package codeforces.p800.sep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StoneGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(s.nextInt());
			}
			sol(list, n);
		}
	}

// O(n) to find the max and min elements and their corresponding positions 
	private static void sol(ArrayList<Integer> list, int n) {
		// find the index of smallest and largest stone
		int maxPos = list.indexOf(Collections.max(list));
		int minPos = list.indexOf(Collections.min(list));
		// Calculate the minimum number of moves for each option

		int option1 = n - minPos + maxPos + 1; // Move to the left until we destroy the smallest stone, then move
												// to the right
		int option2 = minPos + 1 + n - maxPos; // Move to the right until we destroy the smallest stone,
												// then move to the left
		int option3 = n - Math.min(maxPos, minPos); // Move to the left until we destroy both stones

		int option4 = Math.max(maxPos, minPos) + 1; // Move to the right until we destroy both stones
		System.out.println(Math.min(Math.min(option1, option2), Math.min(option3, option4)));

	}

}
