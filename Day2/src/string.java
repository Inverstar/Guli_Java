public class string
{
    //String 是引用数据类型 字符串
    public static void main(String[] args)
    {
        String s1 = "Hello World!";
        System.out.println(s1);
        String s2 = "";

        boolean b1 = true;
        String info = s1 + b1;
        System.out.println(info);

        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);
        System.out.println(c + str + num);
        System.out.println(c + (num + str));
        System.out.println(str + num + c);

        System.out.println('*' + '\t' + '*'); //没有String, 均是+运算
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*"); //前+后连

        String str2 = 3.5f + "";
        System.out.println(str2);

        double n = Double.parseDouble(str2);
        System.out.println(n);
    }
}