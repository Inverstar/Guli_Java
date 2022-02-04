public class Break_Continue
{
    public static void main(String[] args)
    {
        //break 在循环结构和switch-case中使用, 结束当前循环
        //continue 循环结构中使用, 结束当次循环
        int s = 1;
        System.out.println(s);
        while(true)
        {
            s++;
            System.out.println(s);
            if (s != 5) continue;
            System.out.println("OK");
            break;
        }
        //标识符的使用
            label:for(int i = 1;i <= 4;i++)
            {
                for(int j = 1;j <= 10;j++)
                {
                    if(j % 4 == 0)
                    {
//                        break;
//                        continue;
                        //break label;
                        continue label;
                    }
                    System.out.println(j);
                }
            }

        //break;
    }
}
