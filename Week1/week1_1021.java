import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		String bAndC = sc.nextLine();
		int banknotes = (int) Double.parseDouble(bAndC);
		int startIndexDot = bAndC.indexOf(".");
		int coins = (int)(Double.parseDouble(bAndC.substring(startIndexDot, startIndexDot+3)) * 100);

		int b = 0;
		System.out.println("NOTAS:");
		b = banknotes / 100;
		System.out.println(b + " nota(s) de R$ 100.00");
		banknotes = banknotes - b*100;
		b = banknotes / 50;
		System.out.println(b + " nota(s) de R$ 50.00");
		banknotes = banknotes - b*50;
		b = banknotes / 20;
		System.out.println(b + " nota(s) de R$ 20.00");
		banknotes = banknotes - b*20;
		b = banknotes / 10;
		System.out.println(b + " nota(s) de R$ 10.00");
		banknotes = banknotes - b*10;
		b = banknotes / 5;
		System.out.println(b + " nota(s) de R$ 5.00");
		banknotes = banknotes - b*5;
		b = banknotes / 2;
		System.out.println(b + " nota(s) de R$ 2.00");
		banknotes = banknotes - b*2;
		System.out.println("MOEDAS:");
		b = banknotes / 1;
		System.out.println(b + " moeda(s) de R$ 1.00");
		banknotes = banknotes - b*1;

		b = coins / 50;
		System.out.println(b + " moeda(s) de R$ 0.50");
		coins = coins - b*50;
		b = coins / 25;
		System.out.println(b + " moeda(s) de R$ 0.25");
		coins = coins - b*25;
		b = coins / 10;
		System.out.println(b + " moeda(s) de R$ 0.10");
		coins = coins - b*10;
		b = coins / 5;
		System.out.println(b + " moeda(s) de R$ 0.05");
		coins = coins - b*5;
		b = coins / 1;
		System.out.println(b + " moeda(s) de R$ 0.01");
 
    }
 
}
