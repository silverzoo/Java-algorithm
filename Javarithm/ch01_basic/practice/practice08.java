package ch01_basic.practice;

import java.util.Scanner;

public class practice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: "); int a = sc.nextInt();
        System.out.print("b: "); int b = sc.nextInt();

        int result = sumof(a,b);
        System.out.println(STR."\{a}와 \{b}를 포함한 두 수 사이의 총합은 \{result}입니다.");
    }

    static int sumof(int a, int b) {
        int start = (a <= b)? a : b;
        int end = (a >= b)? a : b;
        int sum = 0;

        for(int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
