import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        for (int i = 0; i < a; i++) {
            System.out.println(combiner(reader.readLine()));
        }
    }
    public static String combiner (String words){
        String[] wordsArray = words.split(" ");
        String combinedWord = "";
        String word1 = wordsArray[0]; String word2 = wordsArray[1];
        int cutNumber = 0;
        String cutString = "";
        if (word1.length() == word2.length()) {
            cutNumber = word1.length();
        }
        else if (word1.length() > word2.length()) {
            cutNumber = word2.length();
            cutString = word1.substring(cutNumber);
        }
        else {
            cutNumber = word1.length();
            cutString = word2.substring(cutNumber);
        }
        for (int i = 0; i < cutNumber; i++) {
            combinedWord += word1.substring(i, i + 1);
            combinedWord += word2.substring(i, i + 1);
        }
        combinedWord += cutString;
        return combinedWord;
    }

}
