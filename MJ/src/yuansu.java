import java.util.Dictionary;

public class yuansu
{
//    作者：静言
//    链接：https://www.nowcoder.com/discuss/735766
//    来源：牛客网
//    public static String CountElement(String data)
//    {
//        StringBuilder ans = new StringBuilder();
//        Dictionary<String, Integer> element = new Dictionary<String, Integer>();
//        List<String> lst = new List<String>();
//        List<int> lstNum = new List<int>();
//        Stack<int> s = new Stack<int>();
//        for(int i = 0; i < data.length; ++i)
//        {
//            if(data[i]>='A'&& data[i] <= 'Z')
//            {
//                int tmp = i;
//                ++i;
//                while(i < data.length &&(data[i]<='z'&& data[i] >='a'))
//                {
//                    ++i;
//                }
//                String str = data.SubString(tmp, i - tmp);
//                if(!element.ContainsKey(str))
//                {
//                    element.Add(str, 0);
//                }
//                lst.Add(str);
//                if (i < data.length && (data[i] >= '0' && data[i] <= '9'))
//                {
//                    int sum = 0;
//                    while (i < data.length && (data[i] >= '0' && data[i] <= '9'))
//                    {
//                        sum = sum * 10 + data[i] - '0';
//                        ++i;
//                    }
//                    element[str] += sum;
//                    lstNum.Add(sum);
//                }
//                else
//                {
//                    element[str] += 1;
//                    lstNum.Add(1);
//                }
//                --i;
//            }
//            else if(data[i] == '(')
//            {
//                s.Push(lst.Count);
//            }
//            else if(data[i]  == ')')
//            {
//                ++i;
//                int sum;
//                if (i < data.length && (data[i] >= '0' && data[i] <= '9'))
//                {
//                    sum = 0;
//                    while (i < data.length && (data[i] >= '0' && data[i] <= '9'))
//                    {
//                        sum = sum * 10 + data[i] - '0';
//                        ++i;
//                    }
//                }
//                else
//                {
//                    continue;
//                }
//                sum--;
//                for(int j = s.Pop(); j < lst.Count; ++j)
//                {
//                    element[lst[j]] += sum * lstNum[j];
//                    lstNum[j] += sum * lstNum[j];
//                }
//                --i;
//            }
//        }
//        for(int i = 0; i < lst.Count; ++i)
//        {
//            if(element.ContainsKey(lst[i]))
//            {
//                ans.Append(lst[i] + element[lst[i]]);
//                element.Remove(lst[i]);
//            }
//        }
//        return ans.ToString();
//    }
    public static void main(String[] args)
    {

    }
}
