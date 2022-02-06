import java.util.Arrays;

public class Bubble
    //数组的冒泡排序
    //O(n^2)
{
    public static void main(String[] args)
    {
        int[] Bint = new int[] {43, 32, 88, -98, 0, 83, -21, 99,1};
        boolean isOK = false;
        for(int i = 0; i < Bint.length; i++)
        {
            isOK = true;
            for(int j = 0; j<Bint.length-1-i;j++)
            //每一轮排序都会将剩余数中的max交给Bint[Bint.length-1-i]
            {
                if(Bint[j]>Bint[j+1])
                {
                    isOK = false;
                    Bint[j] ^= Bint[j+1];
                    Bint[j+1] ^= Bint[j];
                    Bint[j] ^= Bint[j+1];
                }
                System.out.println(Arrays.toString(Bint));
            }
            System.out.println(Bint[Bint.length-1-i]);
            //System.out.println(Bint[j-1]);
            if(isOK) break;
        }
        System.out.println(Arrays.toString(Bint));
        int key = Arrays.binarySearch(Bint,-21);
        //二分查找 找到返回数组下标, 否则返回一个负数
        System.out.println(Bint[key]);
        Arrays.fill(Bint,key);
        System.out.println(Arrays.toString(Bint));
    }
}
