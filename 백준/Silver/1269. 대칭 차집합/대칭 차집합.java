import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        int result = 0;


        for(int i = 0; i<n; i++)
        {
            A.add(scanner.nextInt());
        }
        for(int i = 0; i<m; i++)
        {
            B.add(scanner.nextInt());
        }

        for(Object i : A.toArray())
        {
            if(!B.contains(i))
            {
                result++;
            }
        }

        for(Object i : B.toArray())
        {
            if(!A.contains(i))
            {
                result++;
            }
        }


        System.out.println(result);
    }
}