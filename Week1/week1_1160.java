import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCounts = Integer.parseInt(reader.readLine());
        ArrayList<String[]> allArrays = new ArrayList<>();
        for (int i = 0; i < testCounts; i++) {
            allArrays.add(reader.readLine().split(" "));
        }
        for (int i = 0; i < testCounts; i++) {
           howManyTimes(allArrays.get(i));
        }
 
    }
    static void howManyTimes (String[] numbersString){
        int rA, rB;
        double g1, g2;
        rA = Integer.parseInt(numbersString[0]);
        rB = Integer.parseInt(numbersString[1]);
        g1 = Double.parseDouble(numbersString[2]);
        g2 = Double.parseDouble(numbersString[3]);
        int years = 1;
        while (true) {
            if (years > 100) {
                System.out.println("Mais de 1 seculo.");
                break;
            }
            rA += (int)(rA*g1/100);
            rB += (int)(rB*g2/100);
            if (rA > rB) {
                System.out.println(years + " anos.");
                break;
            }
            years++;
        }
    }
 
}
