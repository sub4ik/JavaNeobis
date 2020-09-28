import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String pass = sc.nextLine();
            if (checkPassworld(pass)) System.out.println("Senha valida.");
            else System.out.println("Senha invalida.");
        }


    }
    public static boolean checkPassworld (String pass) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]{6,32}$");
        Matcher m = p.matcher(pass);
        if (m.matches() && pass.matches("(.*)[A-Z](.*)") && pass.matches("(.*)[a-z](.*)") && pass.matches("(.*)[0-9](.*)")) return true;
        return false;
    }

}
