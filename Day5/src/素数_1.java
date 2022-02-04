//算法调优

import java.util.concurrent.CountDownLatch;

public class 素数_1
{
    //public static long L = 10_0000;   //10万 12779ms 130ms(break)
    public static long L = 1_0000_0000;    //百万 192ms 千万 4575ms 亿 121_453ms 138_772ms(continue)

    public static void main(String[] args)
    {
        //System.out.println("开始");
        int Count = 0;
        long start = System.currentTimeMillis();
        label:for(int i = 2;i <L;i++)
        {
            for(int j = 2;j <= Math.sqrt(i);j++)
            {
                if(i%j == 0)
                {
                    continue label;
                }
            }
            Count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数个数 "+Count);
        System.out.println("Time: "+(end - start)+"ms");

    }


}
