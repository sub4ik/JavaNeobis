# JavaNeobis
## КыйналыпКалдым


```
import java.io.IOException;
import java.text.DecimalFormat;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        DecimalFormat decimalFormat = new DecimalFormat("#.#");

		double[] numbers = new double[]{0, 1, 2, 3};
		double i = 0;
		while (true){
			if (i > 2) break;
			System.out.println("I=" + decimalFormat.format(numbers[0]) + " J=" + decimalFormat.format(numbers[1] + i));
			System.out.println("I=" + decimalFormat.format(numbers[0]) + " J=" + decimalFormat.format(numbers[2] + i));
			System.out.println("I=" + decimalFormat.format(numbers[0]) + " J=" + decimalFormat.format(numbers[3] + i));
			numbers[0] += 0.2;

			i+=0.2;
		}
 
    }
 
}
```
