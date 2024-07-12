package ch01_basic;

import java.util.Scanner;

public class practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println(STR."1부터 \{n}까지의 합: \{sum}");
        //문제가 요구하는 답
        System.out.println(STR."while문이 종룔 될 때 변수 i의 값은 \{n}+1이다. \{(i==n+1)}");
    }
}
