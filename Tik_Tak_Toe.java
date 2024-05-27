import java.io.*;
import java.util.*;
public class Tik_Tak_Toe
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
        System.out.println("Current Status is=");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(ar[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO TIK-TAK-TOE GAME");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                ar[i][j]=' ';
            }
        }
        Random rand=new Random();
        Tik_Tak_Toe ob=new Tik_Tak_Toe();
        int n=1,row,col;
        boolean c=false;
        do
        {
            if(n%2!=0)
            {
                System.out.println("This is your Turn");
                System.out.println("Enter row position:");
                row=sc.nextInt();
                System.out.println("Enter column position:");
                col=sc.nextInt();
                if(ar[row][col]==' ')
                {
                    ar[row][col]='X';
                    ob.display();
                }
                else
                {
                    System.out.println("This position has already been filled-up");
                    n--;
                }
            }
            else
            {
                row=rand.nextInt(3);
                col=rand.nextInt(3);
                if(ar[row][col]==' ')
                {
                    ar[row][col]='O';
                    ob.display();
                }
                else
                {
                    n--;
                }
            }
            
            c=ob.check(row,col);
            if(c==true)
            {
                if(n%2!=0)
                {
                   System.out.println("CONGRATULATIONS!!!!!!! you win "); 
                }
                else
                {
                    System.out.println("SORRY!!!!!!!!!!! YOU LOOSE To Computer"); 
                }
            }
            n++;
        }while((c!=true) && (n!=10));
        if(c==false)
        {
            System.out.println("MATCH TIED");
        }
    }
}