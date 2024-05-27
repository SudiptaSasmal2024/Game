import java.io.*;
import java.util.*;
public class Rock_paper_seasor
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();
        String ar[]={"ROCK","PAPER","SEASOR"};
        System.out.println("WELCOME TO THE ROCK-PAPER-SEASOR GAME");
        System.out.println("Enter your chose as \n 1-for Rock \n 2-for Paper \n 3-for seasor");
        int a=sc.nextInt();
        if((a>=1) &&  (a<=3))
        {
            System.out.println("YOU choose "+ar[a-1]);
            int b=rand.nextInt(3);
            System.out.println("Computer choose "+ar[b]);
            int c=a-1;
            if(c==b)
            {
                System.out.println("MATCH TIED");
            }
            else if((c==0) && (b==1))
            {
                System.out.println("YOU LOSS !!!!!");
            }
            else if((c==1) && (b==0))
            {
                System.out.println("YOU WIN !!!!!");
            }
            else if((c==0) && (b==2))
            {
                System.out.println("YOU WIN !!!!!");
            }
            else if((c==2) && (b==0))
            {
                System.out.println("YOU LOSS !!!!!");
            }
            else if((c==2) && (b==1))
            {
                System.out.println("YOU WIN !!!!!");
            }
            else if((c==1) && (b==2))
            {
                System.out.println("YOU LOSS !!!!!");
            }
        }
        else
        {
            System.out.println("your input is wrong");
        }
        
    }
}