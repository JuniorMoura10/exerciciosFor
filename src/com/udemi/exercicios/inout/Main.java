package com.udemi.exercicios.inout;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Digite um número: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                count1++;
            }else{
                count2++;
            }
        }
        System.out.println(count1 + " in");
        System.out.println(count2 + " out");
        sc.close();
    }
}
