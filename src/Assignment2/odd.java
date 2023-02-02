package Assignment2;
import java.util.*;
public class odd
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = sc.nextInt();

        List<Integer> checker=new ArrayList();
        checker.add(sc.nextInt());
        checker.add(sc.nextInt());
        checker.add(sc.nextInt());
        checker.add(sc.nextInt());
        checker.forEach(odd->
        {
            if(odd%2!=0)
                System.out.println("The Odd Numbers are : "+odd);
        });
        sc.close();
    }

}