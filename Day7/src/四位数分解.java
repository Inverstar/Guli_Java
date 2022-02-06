import java.util.Arrays;
//https://leetcode-cn.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
//5984. 拆分数位后四位数字的最小和
public class 四位数分解
{
    public static void main(String[] args)
    {
        四位数分解 A = new 四位数分解();
        int c = A.minimumSum(2932);
        System.out.println(c);
    }
    public int minimumSum(int num)
    {
            int min[] = new int[4];
            min[0] = num/1000;
            min[1] = num/100%10;
            min[2]= num%100/10;
            min[3] = num%10;
            for(int i : min)
                System.out.println(i);
            Arrays.sort(min);

            return 10*(min[0]+min[1])+min[2]+min[3];
    }

}
