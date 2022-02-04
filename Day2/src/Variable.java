/*
    变量必须先声明后使用
    变量有作用域, 作用域外失效

 */
public class Variable
{
    public static void main(String[] args)
    {
        int myAge = 25;
        int myNumber;
        myNumber = 111;
        long C= 121235645644L;//int范围内自动转换接收, 否则报错
        float f = 11;//

        char c1 = '我';
        char c2 = '\n';
        int n = 0;
        n = c2;
        char c3 = '\u00c6'; //198
        System.out.println(c3+c2);


    }
}
