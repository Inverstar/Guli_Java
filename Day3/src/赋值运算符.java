public class 赋值运算符 {
    public static void main(String[] args) {
        int i3 = 10, j3 = 20;

        int num1 = 10;
        num1 += 2;

        int num2 = 12;
        num2 %= 5;

        int m = 2;
        int n = 3;
        n *= m++;// n = 6 m = 3

        n=10;
        n +=(n++)+(++n); //32 10 + 10 + 12

        System.out.println(n);
    }
}
