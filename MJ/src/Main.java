
public class Main {

    public static boolean isRegularMatching(String rule, String str)
    // rule是规则，str是匹配字符串
    {
        int lRule = rule.length();  //lRule是规则长度 *.txt $.txt 5 *
        int lStr = str.length();    //lStr是字符串长度 12.txt a.txt a.tx a.txta
        int iRule = 0;              //规则下标
        int iStr = 0;               //字符串下标
        while (iRule < lRule && iStr < lStr)    //当所有下标没有超出范围时进入循环中
        {
            switch (rule.charAt(iRule)) //1 从0开始对规则字符串提取rule[0]
            { // 1
                case '*':   //如果是*则规则下标后移1位
                {
                    iRule += 1;
                    if (iRule >= lRule) //如果此时规则下标越界，说明所有规则均匹配成功，返回ture
                    {
                        return true;
                    }
                    else  //如果仍有规则则循环移动字符串下标，截取字符串下标为起始位置的剩余字符串对剩余规则进行匹配
                    {
                        for (int i = iStr; i < lStr; i++) //*.txt 1234.txt
                        {
                            //String.Equals(str.Substring(i),rule.Substring(iRule))
                            if (str.substring(i).equals(rule.substring(iRule))) //2
                            {
                                return true;
                                //只要有匹配成功的尾串即可
                            }
                        }
                    }
                    break;
                }
                case '$':
                {
                    if (iStr >= lStr)//3 如果是$则先判断字符串下标是否越界
                    {
                        return false;
                    }
                    while ((iStr < lStr) && (str.charAt(iStr) >= '0') && (str.charAt(iStr) <= '9')) //下标未越界且是数字字符则下标+1
                    {
                        iStr += 1;
                    }
                    iRule += 1;
                    break;
                }
                default:
                {
                    if (rule.charAt(iRule) != str.charAt(iStr))
                    {
                        return false; //4
                    }
                    iRule += 1;
                    iStr += 1;
                    break;
                }
            }
        }
        // 当下标超出范围时，规则下标没有超出，字符串下标超出，说明此时字符串没有需要匹配的字符了，需要*来匹配，判断最后的规则是否为*，是则成功，否则失败
        if (iRule < lRule && iStr >= lStr)
        {
            if (rule.charAt(iRule) == '*')
            {
                return true;
            }
        }
        // 规则下标超出，所有规则匹配完了，如果字符串没有匹配完则失败，否则成功。
        else
        {
            return iStr >= lStr; //5
        }
        return false;
    }

    public static void main(String[] args)
    {
        Main a = new Main();
        System.out.println(a.isRegularMatching("$.txt","12.txt"));
        System.out.println(a.isRegularMatching("$.txt", "123.txt"));
        System.out.println(a.isRegularMatching("$.txt", "a.txt"));
        System.out.println(a.isRegularMatching("*.txt", "12.txt"));
        System.out.println(a.isRegularMatching("*.txt", "1.tx"));
    }
}

