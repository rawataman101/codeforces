//import java.util.Scanner;
//
//public class XeniaAndRingroad {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		int tasks = s.nextInt();
//
//		long time = 0;
//		int house = 1;
//		for (int i = 0; i < tasks; i++) {
//			int curr = s.nextInt();
//			if (curr >= house) {
//				time += curr - house;
//			} else {
//				time += num - (house - curr);
//			}
//			house = curr;
//		}
//		System.out.println(time);
//	}
//}

// Solution 2:
import java.util.Scanner;

public class XeniaAndRingroad {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int tasks = s.nextInt();
		int[] arr = new int[tasks];
		for (int i = 0; i < tasks; i++) {
			arr[i] = s.nextInt();
		}
		int task = arr[0];
		long time = arr[0] - 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				time += num - arr[i - 1] + arr[i];
			} else {
				time += arr[i] - arr[i - 1];
			}
		}
		System.out.println(time);
	}
}