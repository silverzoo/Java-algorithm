package ch03_search.practice;

import java.util.Scanner;

public class Practice01 {
    static int seqSearchSen(int[] a, int n, int key) {
        a[n] = key;
        int cnt = 0;

        for(int i = 0; i <= n; i++){
            if(a[i] == key) break;
            cnt++;
        }

        return (cnt == n)? -1 : cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수: "); int num = sc.nextInt();
        int[] x = new int[num+1]; //요소수 num  +1

        for(int i = 0; i < num; i++) {
            System.out.print(STR."x[\{i}]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: "); int key = sc.nextInt();
        int idx = seqSearchSen(x, num, key);

        if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(STR."그 값은 x[\{idx}]에 있습니다.");
    }
}
