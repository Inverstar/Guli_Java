

public class 账本
{
    public static void main(String[] args)
    {
        String details = "收支\t账户金额\t收支金额\t说 明\n";
        int balance = 10000;
        while(true)
        {
            System.out.println("我的账本");
            System.out.println("1 收支明细");
            System.out.println("2 登记收入");
            System.out.println("3 登记支出");
            System.out.println("4 退出 \n");
            System.out.println("选项(1~4)");

            char selection = Utility.readMenuSelection();
            switch (selection)
            {
                case '1':   System.out.println("当前收支明细记录");
                            //System.out.println("收支\t账户金额\t收支金额\t说 明\t");
                            System.out.println(details);
                            break;
                case '2':   System.out.println("本次收入金额: ");
                            int money = Utility.readNumber();
                            System.out.println("本次收入说明: ");
                            String info = Utility.readString();
                            balance += money;
                            details += ("收入\t" + balance +'\t'+ money + "\t\t"+ info + '\n');
                            System.out.println("登记完成\n");

                            break;
                case '3':   System.out.println("本次支出金额: ");
                            int minusmoney = Utility.readNumber();
                            System.out.println("本次支出说明: ");
                            info = Utility.readString();
                            balance -= minusmoney;
                            details += ("支出\t" + balance + '\t' + minusmoney + "\t\t" + info + '\n');
                            System.out.println("登记完成\n");
                            break;

                case '4':   System.out.println("4 是 否 退 出 ?\n");
                            char isExit = Utility.readConfirmSelection();
                            if(isExit == 'Y')
                            return ;

            }

        }
    }
}
