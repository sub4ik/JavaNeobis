import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCount; i++) {
            System.out.println(caesarCipher(reader.readLine(), Integer.parseInt(reader.readLine())));
        }

    }
    public static String caesarCipher (String cipherLine, int toRightPos) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newWord = "";
        toRightPos = toRightPos % 26;
        for (int i = 0; i < cipherLine.length(); i++) {
            String a = cipherLine.substring(i, i + 1);
            int newIndex = (alphabet.indexOf(a) - toRightPos + 26) % 26;
            newWord += alphabet.substring(newIndex, newIndex + 1);
        }
        return newWord;
    }

}
