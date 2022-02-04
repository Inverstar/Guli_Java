public class 移位预算符 {
    public static void main(String[] args) {
        //左乘右除
        //无符号右移 空缺位均补0
        int i = 21;
        int m = 12;
        int n = 5;

        System.out.println( " m & n :" + ( m & n ) );
        System.out.println( " m | n :" + ( m | n ) );
        System.out.println( " m ^ n :" + ( m ^ n ) );

        System.out.println("i<<2"+(i<<2));
        System.out.println("i<<3"+(i<<3));
        System.out.println("i<<27"+(i<<27));

        int 你 = 10;
        int 我 = 20;

        你 += 我;
        我 = 你 - 我;
        你 = 你 - 我;
        System.out.println(" 你 = " + 你 + " 我 = " + 我 );

        你 = 你 ^ 我;
        我 = 你 ^ 我;
        你 = 你 ^ 我;
        System.out.println(" 你 = " + 你 + " 我 = " + 我 );
    }
}