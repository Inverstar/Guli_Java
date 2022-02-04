public class 逻辑测试题
{
    public static void main(String[] args)
    {
        boolean x = true;
        boolean y = false;
        short z = 42;
        if(y==true)//判断结果为false
            if((z++==42)&&(y=true))z++;
        if((x=false)||(++z==45))z++;
            System.out.println("z="+z);
    }
}

