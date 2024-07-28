package ch07_stringsearching.practice;

import java.util.Scanner;

class Practice04 {
    static int bmMatch(String txt, String pat) {
        int pt;                           // txt를 따라가는 커서
        int pp;                           // pat를 따라가는 커서
        int txtLen = txt.length();        // txt의 문자 개수
        int patLen = pat.length();        // pat의 문자 개수
        int[] skip = new int[Character.MAX_VALUE + 1];
        int count = 0;   // 비교 회수
        int k = -1;

        // skip 테이블 작성
        for (pt = 0; pt <= Character.MAX_VALUE; pt++)
            skip[pt] = patLen;
        for (pt = 0; pt < patLen - 1; pt++)
            skip[pat.charAt(pt)] = patLen - pt - 1;  // pt == patLen - 1

        // 검색
        while (pt < txtLen) {
            pp = patLen - 1;               // pat의 마지막 문자에 주목

            if (k == pt - pp)
                System.out.print("    ");
            else {
                System.out.printf("%2d  ", pt - pp);
                k = pt - pp;
            }
            for (int i = 0; i < txt.length(); i++)
                System.out.print(txt.charAt(i) + " ");
            System.out.println();

            for (int i = 0; i < pt * 2 + 4; i++)
                System.out.print(" ");
            System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
            System.out.println();

            for (int i = 0; i < (pt-pp) * 2 + 4; i++)
                System.out.print(" ");

            for (int i = 0; i < pat.length(); i++)
                System.out.print(pat.charAt(i) + " ");
            System.out.println();
            System.out.println();
            count++;

            while (txt.charAt(pt) == pat.charAt(pp)) {

                if (pp == 0)
                    return pt;         // 검색 성공
                pp--;
                pt--;
                if (k == pt - pp)
                    System.out.print("    ");
                else {
                    System.out.printf("%2d  ", pt - pp);
                    k = pt - pp;
                }
                for (int i = 0; i < txt.length(); i++)
                    System.out.print(txt.charAt(i) + " ");
                System.out.println();

                for (int i = 0; i < pt * 2 + 4; i++)
                    System.out.print(" ");
                System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
                System.out.println();

                for (int i = 0; i < (pt-pp) * 2 + 4; i++)
                    System.out.print(" ");

                for (int i = 0; i < pat.length(); i++)
                    System.out.print(pat.charAt(i) + " ");
                System.out.println();
                System.out.println();
                count++;
            }
            pt += skip[txt.charAt(pt)];
        }
        return -1;		                          // 검색 실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트: ");
        String s1 = sc.next();                     // 텍스트용 문자열

        System.out.print("패  턴: ");
        String s2 = sc.next();                     // 패턴용 문자열

        int idx = bmMatch(s1, s2);                    // 문자열 s1에서 문자열 s2를 BM법으로 검색

        if (idx == -1)
            System.out.println("텍스트 안에 패턴이 없습니다.");
        else {
            // 일치하는 문자 바로 앞까지 반각(1바이트) 문자의 개수를 구합니다
            int len = 0;
            for (int i = 0; i < idx; i++)
                len += s1.substring(i, i + 1).getBytes().length;
            len += s2.length();

            System.out.println(STR."\{idx + 1}번째 문자부터 일치합니다.");
            System.out.println(STR."텍스트: \{s1}");
            System.out.printf(String.format("패 턴: %%%ds\n", len), s2);
        }
    }
}

