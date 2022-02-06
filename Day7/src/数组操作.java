import java.util.Arrays;

public class 数组操作
{
    public static void main(String[] args)
    {
        int[] array1, array2;
        array1 = new int[]{1,2,3,4,5};
        for(int k : array1)
            System.out.print (k+" ");
        System.out.println();
        array2 = array1; //将array1的地址直接给了array2, 所以array2与array1共用同一个数组
        for(int i = 0; i<array2.length; i++)
            if(i%2==0) array2[i]=0;
        for(int k : array1)
            System.out.print (k+" ");

        //真正的数组复制, 将新建数组依次用原数组赋值
        String[] arr = new String[]{"kda","打法","的发放"};
        String[] arr1 = new String[arr.length];
        for(String k : arr)
        {
            int i = 0;
            arr1[i++] = k;
            System.out.println("\n"+k+" "+arr1[i-1]);
        }
        //数组的反转

        for(int i = 0; i<arr.length/2;i++)
        {
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for(String k : arr)
            System.out.print (k+" ");

        //线性查找
        String dest = " ";
        for(String k : arr)
            if(dest.equals(k))
            {
                System.out.println("找到指定元素");
                return ;
            }
        System.out.println("没找到");

        //有序查找使用二分法查找
        int[] int2 = new int[10];
        for(int i=0;i<int2.length;i++)
        {
            int2[i] = (int)(Math.random()*90+10);
            System.out.print (int2[i]+" ");
        }
        System.out.println();
        Arrays.sort(int2);
        for(int i: int2)
            System.out.print(i+" ");
        int dest1 = int2[9];
        int head = 0, end = int2.length;
        while(head <= end)
        {
            int middle = (head+end)/2;
            if(dest1==int2[middle])
            {
                System.out.println("找到了"+middle);
                return;
            }
            else if(int2[middle]>dest1)
                end = middle-1;
            else head = middle+1;
        }
        System.out.println("莫得");
    }
}
