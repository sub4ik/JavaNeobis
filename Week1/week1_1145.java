package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] numbersArray = sc.nextLine().split(" ");

        int firstNumber = Integer.parseInt(numbersArray[0]);
        int secondNumber = Integer.parseInt(numbersArray[1]);
        int count = 1;
        for (int i = 1; i <= secondNumber; i++) {
            if (count != firstNumber) {
                System.out.print(i + " ");
                count++;
            }
            else {
                System.out.println(i);
                count = 1;
            }
        }
    }
}
