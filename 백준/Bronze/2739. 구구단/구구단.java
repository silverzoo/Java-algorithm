import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
        in.close();
        
        for(int i=1; i <10; i ++) {
            System.out.println(A + " * " + i + " = " + (A*i));
        }
	}
}