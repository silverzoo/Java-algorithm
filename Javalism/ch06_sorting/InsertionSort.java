package ch06_sorting;

import java.util.Scanner;
class InsertionSort {
    //--- 단순 삽입 정렬 ---//
    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            //j는 반복제어용 변수
            int j;
            int tmp = a[i];
            for (j = i; j > 0 && a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print(STR."x[\{i}] : ");
            x[i] = sc.nextInt();
        }

        insertionSort(x, nx);        // 배열 x를 단순삽입정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println(STR."x[\{i}]=\{x[i]}");
    }
}
