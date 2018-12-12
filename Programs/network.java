import java.util.*;
import java.io.*;
class network
{
  public static void main(String ar[])throws Exception
  {
    Scanner z=new Scanner(System.in);
    int y1=0,y=0,a=z.nextInt(),b=z.nextInt(),y2=0;
    int arr[][]=new int[a][b];  
    char ho[][]=new char[a][b];   
    for(int x1=0;x1<a;x1++)
    for(y1=0;y1<b;y1++)
    arr[x1][y1]=z.nextInt();
    int nc=z.nextInt();
    for(int y3=0;y3<a;y3++)
    {    
      for(y2=0;y2<b;y2++)
      System.out.print(arr[y3][y2]);
      System.out.println();
    }
    bpit: for(int x=0;x<a;x++)
    {
      for(y=0;y<b;y++)
      {        
        if(arr[x][y]==nc)
        { ho[x][y]='a';
          desig(x,y,nc,arr,ho);
          break bpit;
        }
      }
    }   
    int lo1=0;
    for(int lo2=0;lo2<a;lo2++)
    {
      for(lo1=0;lo1<b;lo1++)
      {
        System.out.print(arr[lo2][lo1]);
      }
      System.out.println();
    }
  }
  public static void desig(int a,int b,int n,int arr[][],char ho[][])
  {
    int x=0,y=0;
    for(x=a-1;x<a+2;x++) 
    {
      for(y=b-1;y<b+2;y++) 
      {
        if(arr[x][y]==n)
        { if((x==a && y==b) || ho[x][y]=='a')
          continue;
          else
          {
            ho[x][y]='a';
            desig(x,y,n,arr,ho);
          }
          
        }
      }  
    }
    arr[a][b]=0;
  }
}