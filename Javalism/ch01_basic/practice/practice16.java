package ch01_basic.practice;

import java.util.Scanner;

public class practice16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 피라미드를 그리시오.");
        int leng;

        do {
            System.out.print("몇 단입니까?: ");
            leng = sc.nextInt();
        } while(leng <= 1);

        npira(leng);
    }

    static void npira(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-((i-1)+1)));
            for(int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print(i%10);
            }
            System.out.println();
        }
    }
}
