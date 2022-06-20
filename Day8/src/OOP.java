public class OOP
{
    //1 Java类及类的成员: 属性, 方法, 构造器; 代码块, 内部类.
    //2 面向对象的三大特征: 封装, 多态, 继承 (抽象)
    //3 关键字

    // 类 Class 对象 Object 对象是类的实例
    //
    // 类的成员 属性 方法
    //Heap堆 存放对象实例
    //Stack栈 存储局部变量
    //Method Area 方法区 用于存储已被加载的信息
    static class Person
    {
        String name;
        int age = 0;
        boolean isMale;

        public void eat()
        {
            System.out.println("吃饭");
        }
        public void walk()
        {
            System.out.println("行走");
        }
        public void display()
        {
            System.out.println("名字: "+name+" 年龄: "+age);
        }
    }
    public static void main(String[] args)
    {
        Person 我 = new Person();
        我.name = "LNQ";
        我.isMale = true;
        System.out.println(我.name);
        我.eat();
        我.display();

        Person 你 = new Person();
        Person 它 = 我;
        它.display();
    }
}
