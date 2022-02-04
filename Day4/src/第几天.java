import java.util.Scanner;

public class 第几天
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年月日: ");
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();

        int sumdays = 0;
        switch(month)
        {
            //Switch中的表达式, byte short char int 枚举类型 (jdk 5) String(jdk 7)
            //Switch-case 比if else效率稍高, 但是只用于清晰简单的情况.
            case 12 : sumdays += 30;
            case 11 : sumdays += 31;
            case 10 : sumdays += 30;
            case 9 : sumdays += 31;
            case 8 : sumdays += 31;
            case 7 : sumdays += 30;
            case 6 : sumdays += 31;
            case 5 : sumdays += 30;
            case 4 : sumdays += 31;
            case 3 :
                if ((year%4 == 0&& year%100 != 0)||year % 400 == 0)
                {
                    sumdays += 29;
                }
                else  sumdays += 28;
            case 2 : sumdays += 31;
            case 1 : sumdays += day;
            defaul : System.out.println(sumdays);
        }
    }
}
