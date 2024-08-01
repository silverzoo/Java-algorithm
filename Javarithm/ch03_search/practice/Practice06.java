package ch03_search.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice06 {
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

        int idx = Arrays.binarySearch(x, key);
        //검색에 실패 시, 삽입 포인트 값을 출력
        if(idx < 0) System.out.println(STR."그 값의 예상 위치는 x[\{(-idx-1)}]입니다.");
        else System.out.println(STR."그 값은 x[\{idx}]에 있습니다.");
    }
}
