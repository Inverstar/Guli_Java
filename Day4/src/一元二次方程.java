import java.util.Scanner;
public class 一元二次方程
{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("一元二次方程：ax^2+bx+c=0");
		System.out.println("请输入参数a b c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		if(a!=0){
			double temp = b*b - 4*a*c;
			if(temp==0){
				double x = -b/(2*a);
				System.out.println("该方程有两个相同解：" + x);
			}else if(temp>0){
				double sqrt = Math.sqrt(temp);

                double x1 = (-b+ sqrt)/(2*a);
                double x2 = (-b- sqrt)/(2*a);
                System.out.println("该方程有两个不同解：" + x1 +"," + x2);
            }else{
                System.out.println("该方程在实数范围内无解！");
            }
        }else{
            if(b!=0){
                double x = -c/b;
                System.out.println("该方程是一元一次方程，有一个解：" + x);
            }else{
                System.out.println("不是方程，是一个等式");
                if(c == 0){
                    System.out.println("等式成立");
                }else{
                    System.out.println("等式不成立");
                }
            }
        }
    }
}
