package ch01_basic.practice;

import java.util.Scanner;

public class practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("a: "); a = sc.nextInt();
        do {
            System.out.print("b: "); b = sc.nextInt();
            System.out.print((b <= a)? "a보다 큰 값을 입력하세요!\n" : "");
        } while (b <= a);

        System.out.println(STR."b - a는 \{b-a}입니다.");
    }

}
