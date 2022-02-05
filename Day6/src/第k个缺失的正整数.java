public class 第k个缺失的正整数
{
//    给你一个 严格升序排列 的正整数数组 arr 和一个整数 k 。
//
//    请你找到这个数组里第 k 个缺失的正整数。


    public int findKthPositive(int[] arr, int k)
    {
        for(int n : arr)
            if(n <= k) k++;
        return k;
    }

    public static void main(String[] args)
    {
       第k个缺失的正整数 啊 = new 第k个缺失的正整数();
       int[] a = {3,4,5,6,7};
       int k = 啊.findKthPositive(a,3);
       System.out.println(k);
    }
}
