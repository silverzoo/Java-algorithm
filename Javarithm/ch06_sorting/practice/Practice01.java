package ch06_sorting.practice;

import java.util.Scanner;

public class Practice01 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        //앞에서 수행한 패스 비교
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++)
                if (a[j] > a[j + 1])
                    swap(a, j, j + 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("단순교환정렬(버블 정렬)");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print(STR."x[\{i}] : ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println(STR."x[\{i}]＝\{x[i]}");
    }
}
