public class 可变参数方法
{
    public static int getSum(int... arr)
    {
        int sum = 0;
        for (int a : arr)
        {
            sum += a;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 4, 62, 431, 2 };
        int sum = getSum(arr);
        System.out.println(sum);

        int sum2 = getSum(6, 7, 2, 12, 2121);
        System.out.println(sum2);

        可变参数方法 A = new 可变参数方法();
        System.out.println(A.getSum(10,1,90));
        //如果在方法书写时，这个方法拥有多个参数，并且参数中包含可变参数，可变参数一定要写在参数列表的末尾。
    }
}
