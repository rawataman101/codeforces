import java.util.Scanner;

public class TPrimes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n-- > 0) {
			boolean isPrime = true;
			int num = s.nextInt();
			Double nd = Math.sqrt(num);
			boolean isDecimal = nd.toString().matches("^\\\\d+\\\\.\\\\d+");
			System.out.println(nd);
			if (isDecimal == true) {
				System.out.println("NO");
			}
			if (nd == 2) {
				System.out.println("YES");
			} else {
				for (int i = 2; i < nd; i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
				System.out.println((isPrime == true) ? "YES" : "NO");

			}
		}
	}
}