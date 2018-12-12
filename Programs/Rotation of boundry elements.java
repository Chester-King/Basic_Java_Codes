import java.io.*;
import java.util.*;
class rotation
{
  public static void main(String aro[])throws Exception
  {
    Scanner z=new Scanner(System.in);
    System.out.println("Entre dimentions of an array in format nXn");
    String s=z.nextLine();
    int d1=0,d2=0;
    StringTokenizer T=new StringTokenizer(s,"X");
    d1=Integer.valueOf(T.nextToken());
    d2=Integer.valueOf(T.nextToken());
    int n=0,ar[][]=new int[d1][d2];
    System.out.println("Entre elements");
    System.out.println();
    for(int m=0;m<d1;m++)
    for(n=0;n<d2;n++)
    ar[m][n]=z.nextInt(); 
    System.out.println("present array");
    for(int i=0;i<d1;i++)
    {
      for(int nom=0;nom<d2;nom++)
      System.out.print(ar[i][nom]+" ") ;
      System.out.println();
    }
    System.out.println("rotated array");
    int r=0,d=0;
    for(int x=1;x<d2+1;x++)
    {
      try
      {
        if(x==1)
        d=ar[0][x-1];
        r=ar[0][x];  
        ar[0][x]=d;
        d=r;
        r=ar[0][x+1];
      } 
      catch(Exception M)
      {
        r=ar[1][d2-1];
        break;
      }         
    }
    for(int y=1;y<d1+1;y++)
    { 
      
      try
      {
        ar[y][d2-1]=d;
        d=r;
        r=ar[y+1][d2-1];  
      } 
      catch(Exception M)
      {
        r=ar[d1-1][d2-2];
        break;
      }
    }
    for(int yo=d2-2;yo>-1;yo--)
    {
      
      try
      {
        ar[d1-1][yo]=d;
        d=r;
        r=ar[d1-1][yo-1];  
      } 
      catch(Exception M)
      {
        r=ar[d1-2][0];
        break;
      }
    }
    for(int md=d1-2;md>-1;md--)
    {
      
      try
      {
        ar[md][0]=d;
        d=r;
        r=ar[md-1][0];  
      } 
      catch(Exception M)
      {
        r=ar[d1-2][0];
        break;
      }
    }
    for(int i90=0;i90<d1;i90++)
    {
      for(int nom90=0;nom90<d2;nom90++)
      System.out.print(ar[i90][nom90]+" ") ;
      System.out.println();
    }
  } 
}