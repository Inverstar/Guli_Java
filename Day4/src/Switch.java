public class Switch {
    public static void main(String[] args)
    {
        int number = 1;
        switch(number)
        {
            //Switch中的表达式, byte short char int 枚举类型 (jdk 5) String(jdk 7)
            case 0 : System.out.println("zero"); break;
            case 1 : System.out.println("One"); break;
            case 2 : System.out.println("Two");
            case 3 : System.out.println("Three");
            case 4 : System.out.println("Four");
            case 5 : System.out.println("Five");
            defaul : System.out.println("NO");
        }
    }
}
