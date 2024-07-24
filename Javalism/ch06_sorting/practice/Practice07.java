package ch06_sorting.practice;

import java.util.Scanner;

public class Practice07 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //--- 단순 삽입 정렬 ---//
    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            for (int m = 0; m < n; m++)
                System.out.printf("%3d ", a[m]);
            System.out.println();

            //j는 반복제어용 변수
            int j;
            int tmp = a[i];
            for (j = i; j > 0 && a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;

            // 주목요소는 '+' 삽입위치는 '^' 그 둘의 간격은 '----'
            System.out.print(" ".repeat(4 * j));
            System.out.print(i != j ? "^-" : "  ");
            System.out.print("-".repeat(4 * (i - j)));
            System.out.println("+");
            System.out.printf("a[%d]의 %d을 a[%d]의 위치에 삽입하였습니다.\n\n", i, tmp, j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("셰이커 정렬(양방향 버블 정렬)");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print(STR."x[\{i}] : ");
            x[i] = sc.nextInt();
        }

        insertionSort(x, nx);
        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println(STR."x[\{i}]＝\{x[i]}");
    }
}
