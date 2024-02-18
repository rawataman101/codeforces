package Google.codeforces.feb;

import java.util.Scanner;

public class Space {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int maxX = Integer.MIN_VALUE;
			int minX = Integer.MAX_VALUE;
			for (int i = 0; i < 4; i++) {
				int x = s.nextInt();
				int y = s.nextInt();
				maxX = Math.max(maxX, x);
				minX = Math.min(minX, x);
			}
			System.out.println((int) (Math.pow(maxX - minX, 2)));
		}
	}

}
