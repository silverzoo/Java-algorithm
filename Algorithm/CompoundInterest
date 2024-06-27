import java.io.*;
import java.util.Scanner;
public class CompoundInterest {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        // 총 동전 + 지폐 수 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        double finalAmount = m;

        // 지시사항을 참고하여 코드를 작성해 보세요.
        for(int i = 1; i <= k; i++) {
            finalAmount *= (1+(double)n/100);
        }

        // 결과 출력
        System.out.println((int) Math.round(finalAmount)); // 소수점 이하는 버리고 반올림
    }
}
