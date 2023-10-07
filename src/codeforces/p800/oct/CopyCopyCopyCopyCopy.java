package codeforces.p800.oct;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * time - O(1)
 * space - O(n)
 */
public class CopyCopyCopyCopyCopy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < n; i++) {
				int e = s.nextInt();
				set.add(e);
			}
			System.out.println(set.size());
		}
	}

}
