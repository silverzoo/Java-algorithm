package ch03_search;

import java.util.Scanner;

public class SeqSearch {
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while(true) {
            if(i == n) return -1;
            if(a[i] == key) return i;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수: "); int num = sc.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print(STR."x[\{i}]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: "); int key = sc.nextInt();
        int idx = seqSearch(x, num, key);

        if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(STR."그 값은 x[\{idx}]에 있습니다.");
    }
}
