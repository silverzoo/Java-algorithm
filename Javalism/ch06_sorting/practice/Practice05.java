package ch06_sorting.practice;

import java.util.Scanner;

public class Practice05 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //--- 양방향 버블 정렬(셰이커 정렬)---//
    static void shakerSort(int[] a, int n) {
        int left = 0;
        int right = n - 1;
        int last = right;

        while (left < right){
            for (int j = right; j > left; j--){
                if (a[j - 1] > a[j]){
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            left = last;

            for (int j = left; j < right; j++){
                if (a[j] > a[j + 1]){
                    swap(a, j, j + 1);
                    last = j;
                }
            }
            right = last;
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

        shakerSort(x, nx);
        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println(STR."x[\{i}]＝\{x[i]}");
    }
}
