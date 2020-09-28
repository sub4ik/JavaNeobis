import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            System.out.println(hahah(sc.nextLine()));
        }

    }
    public static String hahah (String words){
        String newWord = "";
        String palindrom = "";
        for (int i = 0; i < words.length(); i++) {
            if (words.substring(i, i + 1).matches("[aeiou]")) {
                newWord += words.substring(i, i + 1);
            }
        }
        for (int i = 0; i < newWord.length(); i++) {
            palindrom += newWord.substring(newWord.length()-1 - i, newWord.length() - i);
        }
        if (newWord.equals(palindrom)) return "S";
        return "N";
    }

}
