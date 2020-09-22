import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

		String numbersString = sc.nextLine();
		double[] beforeSortingNumbers = new double[3];
		String[] afterSplitNumbers = numbersString.split(" ");
	
		for (int i = 0; i < 3; i++) {
			beforeSortingNumbers[i] = Double.parseDouble(afterSplitNumbers[i]);
		}

		Arrays.sort(beforeSortingNumbers);
		double[] numbers = new double[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = beforeSortingNumbers[2-i];
		}
		double[] numbersSquare = new double[3];
		for (int i = 0; i < 3; i++) {
			numbersSquare[i] = numbers[i]*numbers[i];
		}
		if (numbers[0] >= numbers[1] + numbers[2]){
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			if (numbersSquare[0] == numbersSquare[1] + numbersSquare[2]) System.out.println("TRIANGULO RETANGULO");
			else if (numbersSquare[0] > numbersSquare[1] + numbersSquare[2]) System.out.println("TRIANGULO OBTUSANGULO");
			else if (numbersSquare[0] < numbersSquare[1] + numbersSquare[2]) System.out.println("TRIANGULO ACUTANGULO");
			if (numbers[0] == numbers[1] && numbers[0] == numbers[2]) System.out.println("TRIANGULO EQUILATERO");
			else if (numbers[0] == numbers[1] || numbers[1] == numbers[2]) System.out.println("TRIANGULO ISOSCELES");
		}
 
    }
 
}
