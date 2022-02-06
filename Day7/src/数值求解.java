import com.sun.source.doctree.SummaryTree;

public class 数值求解
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random()*90+10); //[n - m + 1] + m
        int max = arr[0],min = arr[0];
        int sum = 0;
        for(int k : arr)
        {
            sum += k;
            System.out.print(k+" ");
            if(max<k) max=k;
            if(min>k) min=k;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(sum/arr.length);
        System.out.println(max);
        System.out.println(min);
    }
}
