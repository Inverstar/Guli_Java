import java.util.Scanner;

public class While
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int positiveNumber = 0, negativeNumber = 0;
        while(true)
        {
            int number = scan.nextInt();
            if (number > 0)
            {
                positiveNumber++;
            }
            else if (number < 0)
            {
                negativeNumber++;
            }
            else
                break;
        }
        System.out.println("正数: " + positiveNumber);
        System.out.println("负数: " + negativeNumber);
    }

}