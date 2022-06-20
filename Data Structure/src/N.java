import java.util.Scanner;

public class N
{
    public static int n(int N)
    {
        if(N>0)
        {
            System.out.println(N);
            return n(N-1);
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        int c = N.nextInt();
        n(c);
    }
}
