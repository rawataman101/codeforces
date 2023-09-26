import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VanyaAndLanterns {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = s.nextInt(); // input()
		int l = s.nextInt();
		for (int i = 0; i < n; i++) {
			int e = s.nextInt();
			list.add(e);
		}
		Collections.sort(list);
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = list.get(i);
		}
		int firstLampDistance = 0, lastLampDistance = 0;
		if (!list.contains(0))
			firstLampDistance = (arr[0] - 0);
		if (!list.contains(l))
			lastLampDistance = (l - arr[n - 1]);
		int max1 = Math.max(firstLampDistance, lastLampDistance);
		int max2 = 0;
		for (int i = 0; i <= n - 2; i++) {

			max2 = Math.max(max2, (arr[i + 1] - arr[i]));
		}

		System.out.println((max1 > (double) max2 / 2) ? max1 : (double) max2 / 2);
	}
}
