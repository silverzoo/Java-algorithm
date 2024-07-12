package ch01_basic;

import java.util.Scanner;

public class practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        //'가우스의 덧셈' 방식
        for(int i = 1; i <= n/2; i++) {
            sum += (i + n-(i-1));
        }
        sum += (n%2 == 1)? n/2+1 : 0;

        System.out.println(STR."1에서 \{n}까지의 총합은 \{sum}입니다.");
    }
}
