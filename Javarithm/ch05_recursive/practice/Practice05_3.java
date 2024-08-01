package ch05_recursive.practice;

import ch05_recursive.IntStack;

import java.util.Scanner;

public class Practice05_3 {
    static int cnt = 0;
    static void recur(int n) {
        cnt++;
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        recur(x);
        System.out.println(STR."메서드 호출 횟수: \{cnt}");
    }
}