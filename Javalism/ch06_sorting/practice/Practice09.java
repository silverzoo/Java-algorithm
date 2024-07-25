package ch06_sorting.practice;

import java.util.Scanner;

public class Practice09 {
    static int binInsertionSort(int[] a, int n) {
        //unstable 한지 테스트를 위한 cnt 횟수 출력
        //결과: unstable 한 코드다.
        //stable 하게 바꾸러면 어떻게?
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int pl = 0;				// 검색 범위 맨앞의 인덱스
            int pr = i - 1;			// 　 〃 　맨끝의 인덱스
            int pc;					// 　 〃 　중앙의 인덱스
            int pd;					// 삽입하는 위치의 인덱스

            do {
                pc = (pl + pr) / 2;
                if (a[pc] == key)			// 검색 성공
                    break;
                else if (a[pc] < key) {
                    pl = pc + 1;
                }
                else {
                    pr = pc - 1;
                }
            } while (pl <= pr);
            pd = (pl <= pr) ? pc + 1 : pr + 1;

            for (int j = i; j > pd; j--) {
                a[j] = a[j - 1];
                cnt++;
            }
            a[pd] = key;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("이진삽입정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print(STR."x[\{i}] : ");
            x[i] = stdIn.nextInt();
        }


        System.out.println(STR."요소 교환 횟수: \{binInsertionSort(x, nx)}");
        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println(STR."x[\{i}]＝\{x[i]}");
    }
}
