import java.io.*;
import java.util.*;
public class guess_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int a=rand.nextInt(101);
        int c=1,b;
        do
        {
            System.out.println("Enter your Guess number:");
            b=sc.nextInt();
            if(b>a)
            {
                System.out.println("Please Enter some less Number");
            }
            else if(b<a)
            {
               System.out.println("Please Enter some greater Number"); 
            }
            else
            {
                System.out.println("Congratulations!!!!! You successfully guess the correct numbers within "+c+" Attempts");
            }
            System.out.println("=================================");
            c++;
        }while((c!=11) && (b!=a));
        if(c==11)
        {
            System.out.println("SORRY!!!!!!!!!!!YOU Fail to guess the number");
        }
    }
}