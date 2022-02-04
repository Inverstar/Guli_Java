public class 算术运算符 {
    public static void main(String[] args) {
        short s1 = 10;
        s1++; //自增自减不改变变量本身的数据类型

        byte bb1 = 127;
        bb1++;

        System.out.println(bb1);
        int num = 187;
        int 百 = num / 100;
        int 十 = num % 100 / 10;
        int 个 = num % 10;

        System.out.println(百 + " " + 十 + ' ' + 个);
    }
}
