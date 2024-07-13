package ch01_basic;

import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n= sc.nextInt();
        } while (n <= 0);

        int sum = 0;

        for(int i = 1; i < n; i++) {
            if(i < n) System.out.print(STR."\{i} + ");
            sum += i;
        }

        //리팩토링. 마지막 과정을 실행하기 위한 방법을 알고 있는데도 반복문마다 조건을 판단하는 것은 비효율적.
        //방법 1.
        //System.out.print(STR."\{n} = ");
        //sum += n;

        //방법 2.
        System.out.println(STR."\{n} = \{sum += n}");
    }
}
