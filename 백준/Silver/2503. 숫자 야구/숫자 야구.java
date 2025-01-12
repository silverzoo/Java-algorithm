import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // N 입력
        boolean[] check = new boolean[988];
        
        // 123부터 987까지 가능한 숫자 중 조건에 맞는 수를 체크
        for (int i = 123; i <= 987; i++) {
            String num = String.valueOf(i);
            
            if (num.charAt(0) == '0' || num.charAt(1) == '0' || num.charAt(2) == '0') continue; // 숫자에 0이 포함되면 안됨
            if (num.charAt(0) == num.charAt(1) || num.charAt(0) == num.charAt(2) || num.charAt(1) == num.charAt(2)) continue; // 3개의 숫자가 겹치면 안됨
            check[i] = true;
        }
        
        // N번 만큼 스트라이크와 볼을 확인하는 과정
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt(); // 입력 숫자
            int s = sc.nextInt(); // 스트라이크
            int b = sc.nextInt(); // 볼
            
            for (int a = 123; a <= 987; a++) {
                if (check[a]) { // 정답일 수 있는 수라면 탐색
                    int sn = 0; // 스트라이크 수
                    int bn = 0; // 볼 수
                    
                    // 입력받은 숫자와 비교
                    for (int one = 0; one < 3; one++) {
                        char num_split = Integer.toString(num).charAt(one);
                        
                        // 가능한 정답 숫자와 비교
                        for (int two = 0; two < 3; two++) {
                            char a_split = Integer.toString(a).charAt(two);
                            
                            if (num_split == a_split && one == two) sn++; // 숫자와 위치가 같으면 스트라이크
                            else if (num_split == a_split && one != two) bn++; // 숫자는 같고 위치가 다르면 볼
                        }
                    }
                    
                    // 입력받은 스트라이크와 볼의 개수와 일치하면 가능성 있는 수로 유지
                    if (sn == s && bn == b) check[a] = true;
                    else check[a] = false;
                }
            }
        }
        
        int a = 0;
        for (int i = 123; i <= 987; i++) {
            if (check[i]) a++;
        }
        
        System.out.println(a);
    }
}
