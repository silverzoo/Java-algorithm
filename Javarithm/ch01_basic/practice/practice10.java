package ch01_basic.practice;

import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, cnt = 0;

        do {
            System.out.print("양의 정수를 입력하세요: "); a = sc.nextInt();
        } while (a <= 0);

        while(a > 0) {
            a /= 10;
            cnt++;
        }

        System.out.println(STR."그 수는 \{cnt}자리입니다.");
    }

}
