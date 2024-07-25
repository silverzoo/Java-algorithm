package ch06_sorting.practice;

import java.util.Scanner;

public class Practice10_2 {
    static int shellSort(int[] a, int n) {
        int h;
        int cnt = 0;
        //h의 초기값을 구한다.
        for (h = 1; h < n; h = h * 3 + 1)
            ;
        //반복할 때마다 h값을 3으로 나눈다.
        for ( ; h > 0; h /= 3) {
            for (int i = h; i < n; i++) {
                cnt++;
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("셸 정렬(버전 2)");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print(STR."x[\{i}]: ");
            x[i] = sc.nextInt();
        }

        System.out.println(STR."요소의 이동 횟수: \{shellSort(x, nx)}");
        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println(STR."x[\{i}]=\{x[i]}");
    }
}
