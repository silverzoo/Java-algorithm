package ch01_basic.practice;

import java.util.Scanner;

public class practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng;

        do {
            System.out.println("정사각형을 출력합니다.");
            System.out.print("변의 길이: "); leng = sc.nextInt();
        } while (leng <= 0);

        for(int i = 1; i <= leng; i++) {
            for(int j = 1; j <= leng; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
