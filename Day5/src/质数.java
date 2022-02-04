import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Scanner;
// 奇数线性筛法
//
public class 质数
{
    public static int N = 1_0000_0000;  //2184ms 576 1455个
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        //Scanner n = new Scanner(System.in);
        //int N = n.nextInt();
        int[] primes = new int[N];
        Arrays.fill(primes, 1);
        int count = N>2?1:0;
        for(int i = 3; i < N; i+=2)
        {
            if(primes[i]==1)
            {
                count++;
                //System.out.println(i+"是第"+count+"个质数");
                if((long)i*i<N)
                {
                    for(int j = i*i;j<N;j+=i)
                        primes[j]=0;
                }
            }
        }
     System.out.println(count);
     long end = System.currentTimeMillis();
     System.out.println("Time: "+(end - start)+"ms");
    }

}
