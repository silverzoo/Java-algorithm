import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int result = str.length();
        System.out.print(result);
        in.close();
    }
}
