package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int testCounts = sc.nextInt();
        for (int i = 0; i < testCounts; i++) {
            System.out.println(isPrime(sc.nextInt()));
        }

    }
    public static String isPrime (int number) {
        if (number == 1 || number == 2) {
            return number + " eh primo";
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return number + " nao eh primo";
        }
        return number + " eh primo";
    }
}
