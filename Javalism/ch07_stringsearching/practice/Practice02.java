package ch07_stringsearching.practice;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Practice02 {
    static int bfMatchLast(String txt, String pat) {
        int pt = txt.length()-1; //txt 커서
        int pp = pat.length()-1; //pat 커서

        while (pt >= 0 && pp >= 0) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt--;
                pp--;
            } else {
                pt = pt + (pat.length() - pp) - 2;
                pp = pat.length() - 1;
            }
        }

        if (pp < 0)					// 검색 성공
            return pt + 1;
        return -1;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트: ");
        String s1 = sc.next();

        System.out.print("패턴: ");
        String s2 = sc.next();

        int idx = bfMatchLast(s1, s2);

        if(idx == -1) System.out.println("패턴이 없습니다.");
        else {
            // 일치하는 문자 바로 앞까지의 문자 개수를 반각문자로 환산하여 구함
            int len = 0;
            for (int i = 0; i < idx; i++)
                //len += s1.substring(i, i + 1).getBytes("utf-8").length;
                //len += s1.substring(i, i + 1).getBytes("euc-kr").length;
                //len += s1.substring(i, i + 1).length();
                len += s1.substring(i, i + 1).getBytes().length;
            len += s2.length();

            System.out.println(STR."\{idx + 1}번째 문자부터 일치합니다.");
            System.out.println(STR."텍스트 : \{s1}");
            System.out.printf(String.format("패 턴 : %%%ds\n", len), s2);
        }
    }
}
