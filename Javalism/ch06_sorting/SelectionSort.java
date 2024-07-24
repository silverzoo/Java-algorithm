package ch06_sorting;

import java.util.Scanner;
class SelectionSort {
    //--- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //--- 단순 선택 정렬 ---//
    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            // 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 저장
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;
            // 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환
            swap(a, i, min);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("단순 선택 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print(STR."x[\{i}] : ");
            x[i] = sc.nextInt();
        }

        selectionSort(x, nx);            // 배열 x를 단순선택정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println(STR."x[\{i}]=\{x[i]}");
    }
}
