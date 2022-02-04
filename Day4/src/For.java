import java.util.Scanner;

public class For
{
    /*For 循环结构的使用
    * 1初始化条件
    * 2循环条件
    * 3循环体
    * 4迭代条件
    * */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int min = (m <= n)? m : n;
        for (int i = min; i >= 1; i--)
        {
            if(m%i == 0&& n % i == 0)
            {
                System.out.println("最大公约数: " + i);
                break; //循环中遇到break就跳出
            }
        }

        int max = (m >= n)? m : n;
        for (int i = max; i <= m*n; i++)
        {
            if(i % m == 0 && i % n == 0)
            {
                System.out.println("最小公倍数: " + i);
                break; //循环中遇到break就跳出
            }
        }
    }

}
