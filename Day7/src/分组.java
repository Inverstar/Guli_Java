import java.util.Arrays;
//https://leetcode-cn.com/problems/partition-array-according-to-given-pivot/
//5985. 根据给定数字划分数组
public class 分组
{
    public int[] pivotArray(int[] nums, int pivot)
    {
        int Da =0, Xiao=0, Zhong = 0;
        for(int i: nums)
        {
            if(i>pivot) Da++;
            else if(i == pivot) Zhong++;
            else Xiao++;
        }
        System.out.println(Da+" "+Zhong+" "+Xiao);
        int D[] = new int[Da];
        int Z[] = new int[Zhong];
        int X[] = new int[Xiao];
        Da = 0;Xiao = 0;Zhong = 0;
        for(int i : nums)
        {
            if(i>pivot)
                D[Da++]=i;
            else if(i == pivot)
                Z[Zhong++]=i;
            else
                X[Xiao++]=i;
        }
        System.out.println(Da+" "+Zhong+" "+Xiao);
        for(int i = 0;i<nums.length;i++)
        {
            if(i<Xiao)
                nums[i] = X[i];
            else if(i<Zhong+Xiao)
                nums[i] = Z[i-Xiao];
            else nums[i] = D[i-Xiao-Zhong];
        }
        return nums;
    }

    public static void main(String[] args)
    {
      分组 F = new 分组();
      int[] o = {9,12,5,10,14,3,10};
      System.out.println(Arrays.toString(F.pivotArray(o, 10)));

//      F.pivotArray(o,10);
    }
}
