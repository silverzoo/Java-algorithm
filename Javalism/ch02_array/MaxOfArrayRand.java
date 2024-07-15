package ch02_array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수: "); int num = sc.nextInt();

        int[]height = new int[num];

        System.out.println("키값은 아래와 같습니다.");
        for(int i = 0; i < num; i++) {
            height[i] = 100+random.nextInt(90);
            System.out.println(STR."hieght[\{i}]: \{height[i]}");
        }

        System.out.println(STR."최대값은 \{maxOf(height)}입니다.");
    }

    static int maxOf(int[] a) {
        int max = a[0];
        for(int i = 1; i < a.length; i++) {
            max = (a[i] > max)? a[i] : max;
        }
        return max;
    }
}
