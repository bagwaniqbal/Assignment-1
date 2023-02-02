package Assignment2;

import java.util.*;


public class Units
{
    public static void main(String args[])
    {
        Scanner newscanner=new Scanner(System.in);
        System.out.print("Enter units: ");
        int U =newscanner.nextInt();

        System.out.println(
                calculatebill(U));
        //newscanner.close();
    }

    public static int calculatebill(int consume)
    {

        if (consume <= 100)
        {
            return consume * 10;
        }

        else if (consume <= 200)
        {
            return (100 * 10)+(consume - 100) * 15;
        }

        else if (consume <= 300)
        {
            return (100 * 10)+ (100 * 15) + (consume - 200)* 20;
        }

        else if (consume > 300)
        {
            return (100 * 10) + (100 * 15) + (consume - 300) * 25;
        }
        return 0;
    }
}
