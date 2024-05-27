import java.io.*;
import java.util.*;
public class Tik_Tak_Toe_edit
{
    static char ar[][]=new char[3][3];
    boolean check(int a,int b)
    {
        char ch=ar[a][b];
        if((ar[0][0]==ch) && (ar[0][1]==ch) && (ar[0][2]==ch))
        return true;
        else if ((ar[1][0]==ch) && (ar[1][1]==ch) && (ar[1][2]==ch))
        return true;
        else if ((ar[2][0]==ch) && (ar[2][1]==ch) && (ar[2][2]==ch))
        return true;
        else if ((ar[0][0]==ch) && (ar[1][0]==ch) && (ar[2][0]==ch))
        return true;
        else if ((ar[0][1]==ch) && (ar[1][1]==ch) && (ar[2][1]==ch))
        return true;
        else if ((ar[0][2]==ch) && (ar[1][2]==ch) && (ar[2][2]==ch))
        return true;
        else if ((ar[0][0]==ch) && (ar[1][1]==ch) && (ar[2][2]==ch))
        return true;
        else if ((ar[0][2]==ch) && (ar[1][1]==ch) && (ar[2][0]==ch))
        return true;
        else 
        return false;
    }
    void display()
    {
        System.out.println("Current Status is:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(ar[i][j]+" | ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO TIK-TAK-TOE GAME");
        System.out.println("Enter player-1 Name:");
        String p1=sc.nextLine();
        System.out.println("Enter player-2 Name:");
        String p2=sc.nextLine();
        System.out.println("This is TOSS round- Please "+p1+" choose an option for \n 0 - for Head \n 1 - for tail \n Please Enter a choise:");
        int x=sc.nextInt();
        Random rand = new Random();
        int m=rand.nextInt(2);
        if((x>=0) && (x<=1))
        {
            if(m==x)
            {
                System.out.println(p1+" Win the toss...."+p1+" will start first");
            }
            else
            {
                System.out.println(p2+" Win the toss...."+p2+" will start first");
                String p3=p1;
                p1=p2;
                p2=p3;
            }
            System.out.println("Let's Start the game:\n-----------------------------");
        }
        else
        {
            System.out.println("WRONG INPUT!!!!");
            System.exit(0);
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                ar[i][j]=' ';
            }
        }
        Tik_Tak_Toe_edit ob=new Tik_Tak_Toe_edit();
        int n=1,row,col;
        boolean c=false;
        do
        {
            if(n%2!=0)
            {
                System.out.println("This is "+p1+"'s Turn");
                System.out.println("Enter row position:");
                row=sc.nextInt();
                System.out.println("Enter column position:");
                col=sc.nextInt();
                if((row<3) && (col<3) && (ar[row][col]==' '))
                {
                    ar[row][col]='X';
                    c=ob.check(row,col);
                }
                else if((row>=3 || col>=3))
                {
                    System.out.println("WRONG INPUT");
                    n--;
                }
                else
                {
                    System.out.println("This position has already been filled-up");
                    n--;
                }
            }
            else
            {
                System.out.println("This is "+p2+"'s Turn");
                System.out.println("Enter row position:");
                row=sc.nextInt();
                System.out.println("Enter column position:");
                col=sc.nextInt();
                if((row<3) && (col<3) && (ar[row][col]==' '))
                {
                    ar[row][col]='O';
                    c=ob.check(row,col);
                }
                else if((row>=3 || col>=3))
                {
                    System.out.println("WRONG INPUT");
                    n--;
                }
                else
                {
                    System.out.println("This position has already been filled-up");
                    n--;
                }
            }
            ob.display();
            if(c==true)
            {
                if(n%2!=0)
                {
                   System.out.println("CONGRATULATIONS!!!!!!! "+p1+" is winner"); 
                }
                else
                {
                    System.out.println("CONGRATULATIONS!!!!!!! "+p2+" is winner"); 
                }
            }
            System.out.println("\n -----------------------------------");
            n++;
        }while((c!=true) && (n!=10));
        if(c==false)
        {
            System.out.println("MATCH TIED");
        }
    }
}