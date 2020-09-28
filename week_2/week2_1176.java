import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countNumbers = sc.nextInt();

		long[] fibNumbers = new long[61];
		fibNumbers[0] = 0;
		fibNumbers[1] = 1;
		for (int i = 2; i < 61; i++) {
			fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
		}
		for (int i = 0; i < countNumbers; i++) {
			int a = sc.nextInt();
			System.out.println("Fib(" + a + ") = " + fibNumbers[a]);
		}
	}
}
