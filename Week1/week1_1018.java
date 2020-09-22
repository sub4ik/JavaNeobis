import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		System.out.println(a);
		b = a / 100;
		System.out.println(b + " nota(s) de R$ 100,00");
		a = a - b*100;
		b = a / 50;
		System.out.println(b + " nota(s) de R$ 50,00");
		a = a - b*50;
		b = a / 20;
		System.out.println(b + " nota(s) de R$ 20,00");
		a = a - b*20;
		b = a / 10;
		System.out.println(b + " nota(s) de R$ 10,00");
		a = a - b*10;
		b = a / 5;
		System.out.println(b + " nota(s) de R$ 5,00");
		a = a - b*5;
		b = a / 2;
		System.out.println(b + " nota(s) de R$ 2,00");
		a = a - b*2;
		b = a / 1;
		System.out.println(b + " nota(s) de R$ 1,00");
 
    }
 
}
