package org.example;

import java.util.Scanner;

public class BirthdayStdin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for (int i = 0; i < numCases; i++) {
            int age = sc.nextInt();
            String binaryAge = Integer.toBinaryString(age);
            int cont = 0;
            for (int j = 0; j < binaryAge.length(); j++) {
                if (binaryAge.charAt(j) =='1'){
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
}
