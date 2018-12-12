/*
Write a program to input a date and a particular number of days which are to be added to the date.
Print the calendar of the month after adding the number of days to the date.
*/
import java.io.*;
import java.util.*;
class calendar
{
  public static void main(String ar[])throws Exception
  {
    Scanner z=new Scanner(System.in);
    System.out.println("Input the date(only day)");
    int x=0,d=z.nextInt(),y=0,sd=0,j=0;
    System.out.println("Input the month");
    String m=z.next();
    System.out.println("Input the year");
    y=z.nextInt();
    System.out.println("Input the number of days to be added");
    sd=z.nextInt();
    sd--;
    int cal[][]=new int[6][7],da=sd,c=0;
    if(m.equalsIgnoreCase("January") || m.equalsIgnoreCase("March") || m.equalsIgnoreCase("May") || m.equalsIgnoreCase("july") || m.equalsIgnoreCase("August") || m.equalsIgnoreCase("Octubar") || m.equalsIgnoreCase("December"))
    {
      x=31;
    }
    else 
    {
      if(m.equalsIgnoreCase("february"))
      {if(y%100!=0)
        {
          if(y%4!=0)
          x=28;
          else
          x=29;
        }
        else 
        {
          if(y%400==0)
          x=29;
          else
          x=28;
        }
        
      }
      else
      x=30;
    }
    da--;    
    a: for(int i=0;i<6;i++) 
    {if(i>0)
      da=0;
      for(j=da;j<7;j++)
      {
        cal[i][j]=c++;
        if(c==(x+1))
        break a;
      }
      
    }   
    System.out.println("S"+"\t"+"M"+"\t"+"T"+"\t"+"W"+"\t"+"T"+"\t"+"F"+"\t"+"S"+"\t"); 
    int ka=0;     
    for(int lpg=0;lpg<6;lpg++)
    {
      for(ka=0;ka<7;ka++) 
      {
        if(cal[lpg][ka]!=0)  
        System.out.print(cal[lpg][ka]+"\t");
        else
        System.out.print(" "+"\t");
      }  
      System.out.println();
    }
  }                                                                                                                                                                                        
}
