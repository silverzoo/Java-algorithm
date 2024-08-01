package ch04_stackqueue;

import java.util.Scanner;

public class InStackTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack s = new IntStack(64); //최대 64개 푸시 가능한 스택
        
        while(true) {
            System.out.println();
            System.out.println(STR."현재 데이터 개수: \{s.size()}");
            System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(0)종료: ");

            int menu = sc.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터: ");
                    x = sc.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:                                // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 3:                                // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 4:                                // 덤프
                    s.dump();
                    break;
            }
        }
    }
}
