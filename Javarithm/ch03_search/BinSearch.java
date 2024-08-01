package ch03_search;

import java.util.Scanner;

public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl+pr) / 2;
            if(a[pc] == key) return pc;
            else if(a[pc] < key) pl = pc + 1; //검색 범위를 뒤의 절반으로 좁힘
            else pr = pc - 1; //검색 범위를 앞의 절반으로 좁힘
        } while (pl <= pr);

        return -1; //검색 실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수: "); int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");
        System.out.print("x[0]: "); x[0] = sc.nextInt();

        for(int i = 1; i < num; i++) {
            do {
                System.out.print(STR."x[\{i}]: ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i-1]);
        }

        System.out.print("검색할 값: "); int key = sc.nextInt();

        int idx = binSearch(x, num, key);
        if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(STR."그 값은 x[\{idx}]에 있습니다.");
    }
}
