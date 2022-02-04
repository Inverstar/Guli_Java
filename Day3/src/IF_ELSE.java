import java.util.Scanner;
class scanner
{
    public void s()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名: ");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄: ");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重: ");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你相信爱情吗? 真或假: ");
        boolean love = scan.nextBoolean();
        System.out.println(love);

        //char型, Scanner没有提供相关方法, 只能用字符串接收
        System.out.println("你的性别 男或女: ");
        String gender= scan.next();
        char genderChar = gender.charAt(0);
        System.out.println(gender);
    }

}
public class IF_ELSE
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入三个整数");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        if(n1 <= n2)
        {
            if(n3 >= n2)
                System.out.println(n1+" "+n2+" "+n3);

            else if(n3 <= n1)
                System.out.println(n3+" "+n1+" "+n2);

            else
                System.out.println(n1+" "+n3+" "+n2);
        }
        else
        {
            if(n3 >= n1)
                System.out.println(n2+" "+n1+" "+n3);
            else if(n3 <= n2)
                System.out.println(n3+" "+n2+" "+n1);
            else
                System.out.println(n2+" "+n3+" "+n1);
        }

//        scanner scan = new scanner();
//        scan.s();
    }


}
