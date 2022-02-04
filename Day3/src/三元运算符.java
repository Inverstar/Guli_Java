public class 三元运算符 {
    public static void main(String[] args) {
        // ( 条件表达式 ) ? 表达式1 : 表达式2
        // 三元运算符效率高, if - else 适用范围广
        int h1 = 12;
        int h2 = 5;
        boolean k = false;
        int max = ( k ) ? h1 : h2 ;
        int m = ( h1 > h2 ) ? h1 : Integer.parseInt("h2");
        System.out.println(max);
        System.out.println(m);
    }
}