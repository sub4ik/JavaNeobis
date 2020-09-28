import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int aa = Integer.parseInt(reader.readLine());
        for (int j = 0; j < aa; j++) {
            String[] aaaaa = reader.readLine().split(" ");
            int menCounts = Integer.parseInt(aaaaa[0]);
            int a = Integer.parseInt(aaaaa[1]) - 1;
            int k = a;
            ArrayList<Integer> men = new ArrayList<>();
            for (int i = 0; i < menCounts; i++) {
                men.add(i + 1);
            }
            while (men.size() > 1){
                k = k % men.size();
                men.remove(k);
                k += a;
            }
            System.out.println("Case " + (j + 1) + ": " + men.get(0));
        }

    }


}
