public class 逻辑运算符 {
    public static void main(String[] args) {
        //&逻辑与
        //&& 短路与
        //| 逻辑或
        //|| 短路或
        //! 非
        //^ 逻辑异或
        boolean h1 = true;
        boolean h2 = false;
        System.out.println(h2 == h1);
        System.out.println(h2 = h1);

        int num1 = 10;
        if(h1 & (num1++ > 0))// 无论h1真或假, 后面都会执行
        {
            System.out.println("喔喔喔");
        }
        else
            System.out.println("num1="+num1);



        if(h1 && (num1++ > 0))
        {
            System.out.println("喔喔喔");
        }
        else
            System.out.println("num1="+num1);


    }
}
