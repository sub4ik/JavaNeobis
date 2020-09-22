import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int sHour, sMinutes, fHour, fMinutes;
        sHour = sc.nextInt();
        sMinutes = sc.nextInt();
        fHour = sc.nextInt();
        fMinutes = sc.nextInt();

        if (sHour == fHour && sMinutes == fMinutes) System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        else {
            if (fMinutes < sMinutes) {
                if (sHour < fHour) System.out.println("O JOGO DUROU " + (fHour - 1 - sHour) + " HORA(S) E " + (60 + fMinutes - sMinutes ) + " MINUTO(S)");
                else System.out.println("O JOGO DUROU " + (24 + fHour - 1 - sHour) + " HORA(S) E " + (60 + fMinutes - sMinutes ) + " MINUTO(S)");
            }
            else if (fHour >= sHour) System.out.println("O JOGO DUROU " + (fHour - sHour) + " HORA(S) E " + (fMinutes - sMinutes) + " MINUTO(S)");
            else if (fHour < sHour) System.out.println("O JOGO DUROU " + (24 + fHour - sHour) + " HORA(S) E " + (fMinutes - sMinutes) + " MINUTO(S)");
        }
    }
 
}
