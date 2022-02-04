public class 厄拉多塞筛法
{
    public static void main(String[] args)
    {
            long start = System.currentTimeMillis();
            int n = 1_0000_0000;    //2337ms    5761455
            int count=0;
            boolean[] flag=new boolean[n];
            for(int i=2;i<n;i++)
            {
                if(!flag[i])
                {
                    count++;
                    for(int j=i+i;j<n;j+=i)
                        flag[j]=true;
                }
            }

        long end = System.currentTimeMillis();
        System.out.println("质数个数 "+count);
        System.out.println("Time: "+(end - start)+"ms");
    }
}
