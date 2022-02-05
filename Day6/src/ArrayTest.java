//数组基础理论
import java.util.Arrays;
public class ArrayTest
{
    public static void main(String[]args)
    {
        int[] a = {1, 2, 3};
        int[] b = new int[] {1, 2, 3};
        int[] c = new int[3];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;
        System.out.println(a.length);
        int [][] aa =
        {
            {16, 3, 2, 13},
            {5, 10, 11, 8},
            {9, 6, 7, 12},
            {4, 15, 14, 1}
        };
        System.out.println(aa.length); //4
        double[][] bb = new double[ ][ ]
        {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };

        //Java 实际上没有多维数组，只有一维数组。多维数组被解释为数组的数组
        double[] temp = bb[1];
        bb[1] = bb[2];
        bb[2] = temp;
        //由于可以单独地存取数组的某一行， 所以可以让两行交换。

//        for(variable : collection)
//        {
            //collection这一集合表达式必须是一个数组或者是一个实现了 Iterable 接口的类对象
//          // todo
//        }
        for(int[] A : aa)
        {
            int i = A.length - 1;
            System.out.println(A[i]);// 取矩阵aa的最后列
        }
        for(int[] row : aa)
        { // 遍历每一行
            for(int value : row)
            { // 遍历每一列
                System.out.println(value);
            }
        }

        System.out.println(Arrays.toString(a));
       //Arrays.toString - 将一维数组转成字符串类型（打印一维数组的所有元素）

        System.out.println(Arrays.deepToString(aa));
        //Arrays.deepToString - 将二维数组转成字符串类型（打印二维数组的所有元素）

        //Arrays.copyOf - 数组拷贝。举个例子，将 a 数组中的元素全部拷贝给 c 数组：

        int[] d = Arrays.copyOf(a, 2 * a.length);
        //第 2 个参数是新数组的长度。这个方法通常用来增加新数组的大小：如果数组元素是数值型，多余的元素将被赋值为 0 ; 布尔型，则将赋值为 false 等。
        // 相反，如果长度小于原始数组的长度，则只拷贝最前面的数据元素。

        //Arrays.sort - 对数组中的元素进行排序
        Arrays.sort(aa[1]); //不可用于二维数组
        for(int[] row : aa)
        { // 遍历每一行
            for(int value : row)
            { // 遍历每一列
                System.out.print(value+" ");
            }
            System.out.println();
        }

        boolean z = Arrays.equals(a,d);
        //Arrays.equals - Arrays 类提供了重载后的 equals 方法，用来基于内容比较数组，数组相等的条件是元素个数和对应位置的元素都相等。
        System.out.println(z);

    }
}
