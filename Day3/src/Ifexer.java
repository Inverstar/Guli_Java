import java.util.Scanner;

public class Ifexer
{
    public static void main(String[] args)
    {
        int x = 4;
        int y = 2;
        if (x > 2)
        {
            if (y > 2)
                System.out.println(x + y);
            System.out.println("错误");
        }
        else
            System.out.println("x is" + x);
        //随机数 10 - 99
        int value = (int)(Math.random() * 90 + 10); //因为java小数不足的问题, 达不到100
        System.out.println(value);
        //[a, b] : (int) (Math.random() * (b-a+1)+a)
    }
}
