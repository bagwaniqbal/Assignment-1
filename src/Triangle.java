import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int num1, num2, num3;
        int sum;

        num1 = scr.nextInt();
        num2 = scr.nextInt();
        num3 = scr.nextInt();
        sum = num1+num2+num3 ;

        if(sum==180)
        {
            if(num1==90 ||num2 == 90 ||num3==90)
            {
                System.out.println("Prize 2");
            }
            else
            {
                System.out.println("Prize 1");
            }
        }
        else
        {
            System.out.println("No Prize");
        }
    }
}