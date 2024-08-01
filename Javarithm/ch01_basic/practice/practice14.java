package ch01_basic.practice;

import java.util.Scanner;

public class practice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("직각 이등변삼각형을 그리시오.");
        int leng;

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            leng = sc.nextInt();
        } while(leng <= 1);

        triangleLB(leng);
        triangleLU(leng);
        triangleRU(leng);
        triangleRB(leng);
    }

    static void triangleLB(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력하였습니다.");
        System.out.println("-------------------------------------\n");
    }

    static void triangleLU(int n) {
        for(int i = n; 1 <= i; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("왼쪽 위가 직각인 이등변삼각형을 출력하였습니다.");
        System.out.println("-------------------------------------\n");
    }

    static void triangleRU(int n) {
        for(int i = n; 1 <= i; i--) {
            System.out.print(" ".repeat(n-i));
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("오른쪽 위가 직각인 이등변삼각형을 출력하였습니다.");
        System.out.println("-------------------------------------\n");
    }

    static void triangleRB(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
            for(int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("오른쪽 아래가 직각인 이등변삼각형을 출력하였습니다.");
        System.out.println("-------------------------------------\n");
    }
}
