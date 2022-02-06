public class ArrayException
{
    //数组常见异常
    /*  1数组下标越界 ArrayIndexOutOfBoundsException
        2空指针异常  NullPointerException
    * */
    public static void main(String[] args)
    {
        int[] a = new int[5];
        a = null;
        System.out.println(a[0]);
    }
}
