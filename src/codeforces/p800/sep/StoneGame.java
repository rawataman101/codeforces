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

	private static void sol(ArrayList<Integer> list, int n) {
		int max = Collections.max(list);
		int min = Collections.min(list);
		int indexOfMin = list.indexOf(min);
		int indexOfMax = list.indexOf(max);
		int movesMin = Math.min(indexOfMin, n - indexOfMax + 1);
		int movesMax = Math.min(indexOfMax, n - indexOfMax + 1);
		System.out.println(movesMax +" "+movesMin);

	}

}
