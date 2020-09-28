import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int testCounts = sc.nextInt();
        for (int i = 0; i < testCounts; i++) {
            System.out.println(isPerfectNumber(sc.nextInt()));
        }

    }
    public static String isPerfectNumber (int number) {
        int isPerfect = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                isPerfect += i;
            }
        }
        if (isPerfect == number) return number + " eh perfeito";
        else return number + " nao eh perfeito";
    }
}
