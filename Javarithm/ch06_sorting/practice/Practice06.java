package ch06_sorting.practice;

import java.util.Scanner;

public class Practice06 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //--- 단순선택정렬 ---//
    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            // 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;
            for (int m = 0; m < n; m++)
                //정렬되지 않으면서 최소값인 요소는 *없이 +만 표시
                System.out.print((m == min) ? "  + " : (m == i) ? "  * " :  "    ");
            System.out.println();

            for (int m = 0; m < n; m++)
                System.out.printf("%3d ", a[m]);
            System.out.println("\n");
            // 아직 정렬되지 않은 부분의 맨앞 요소와 가장 작은 요소를 교환
            swap(a, i, min);
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

        selectionSort(x, nx);
        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println(STR."x[\{i}]＝\{x[i]}");
    }
}
