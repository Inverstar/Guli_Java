public class 内存解析
{
    //堆 和 栈
    //stack heap
    public static void main(String[] args)
    {
        char [][] arr = new char[4][4];
        //int k = arr[0][0];
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);

        int [][] ar = new int[4][4];
        System.out.println(ar[0]);
        System.out.println(ar[0][0]);//Exception in thread "main" java.lang.NullPointerException
        //注意特殊写法情况：int[] x,y[]; x是一维数组，y是二维数组。

        //boolean false
        //int 0
        //char 0
        //double 0.0
        //String(引用) null
    }
}
