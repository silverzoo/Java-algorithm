package ch01_basic.practice;

import java.util.Scanner;

public class practice15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("피라미드를 그리시오.");
        int leng;

        do {
            System.out.print("몇 단입니까?: ");
            leng = sc.nextInt();
        } while(leng <= 1);

        spira(leng);
    }

    static void spira(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-((i-1)+1)));
            System.out.print("*".repeat((i-1)*2+1));
            System.out.println();
        }
    }

    /*
    static void spira(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */
}
