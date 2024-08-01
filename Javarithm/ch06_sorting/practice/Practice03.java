package ch06_sorting.practice;

import java.util.Scanner;

public class Practice03 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        //ccnt는 비교 수 scant 교환 수
        int ccnt = 0;
        int scnt = 0;

        for (int i = 0; i < n - 1; i++) {
            int exchg = 0;
            System.out.printf("패스 %d : \n", i + 1);
            for (int j = n - 1; j > i; j--) {
                for (int m = 0; m < n - 1; m++)
                    System.out.printf("%3d %c" , a[m], (m != j-1) ? ' ' :
                            (a[j - 1] > a[j]) ? '+' : '-');
                System.out.printf("%3d\n", a[n - 1]);

                ccnt++;
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    scnt++;
                    exchg++;
                }
            }
            for (int m = 0; m < n; m++)
                System.out.printf("%3d  " , a[m]);
            System.out.println();
            if(exchg == 0) break;
        }
        System.out.println(STR."비교를 \{ccnt}회 했습니다.");
        System.out.println(STR."교환을 \{scnt}회 했습니다.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("단순교환정렬(버블 정렬)");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print(STR."x[\{i}] : ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);
    }
}
