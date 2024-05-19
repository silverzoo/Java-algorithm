import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //문자열이 섞인 출력에서 삼항연산자의 활용
        System.out.println(n + " is " + ((n%2 == 0)? "even" : "odd"));
    }
}