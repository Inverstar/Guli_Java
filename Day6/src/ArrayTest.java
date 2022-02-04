//数组基础理论

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
    }
}
