import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int numberColumn = sc.nextInt();
        char sumOrAverage = sc.next().charAt(0);
        double[][] square = new double[12][12];
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                square[i][j] = sc.nextDouble();
            }
        }
        double sum = 0.0;
        for (int i = 0; i < 12; i++) {
            sum += square[i][numberColumn];
        }
        if (sumOrAverage == 'S') System.out.println(decimalFormat.format(sum));
        else if (sumOrAverage == 'M') System.out.println(decimalFormat.format(sum/12));
    }
}
