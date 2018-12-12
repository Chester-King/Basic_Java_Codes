import java.io.*;
import java.util.*;
class luckyno
{
  
  public static void main(String ar[])throws Exception
  {
    Scanner z=new Scanner(System.in);
    System.out.println("Entre no. of elements of array");                       //input no.of elements
    int y=0,c=0,mo=0,l=0,d=0,n=z.nextInt();                                     //declaring variables
    int m[]=new int[n];                                                         //declaring array
    System.out.println("ENTRE Elements");                                       
    for(int x=0;x<m.length;x++)                                                 //inputing elements
     {
       m[x]=z.nextInt(); }
    l=luck(m);                                                                  //calling luck function for lucky no.
    System.out.println("lucky no."+l);                                          //printing lucky no.
  }
  public static int luck(int e[])                                               //"luck" function prototype
  {
    int g=0,t=0,p=0,al=0;                                                       //declaring variables used for function "luck"
    for(int c=1;c<=e.length-1;c++)                                              //checking and converting no. to zero
    {
      int st=e[al];
      while(st>0)                                                               //until no. do not becomes zero
      {
        if(e[al]!=0)                                                            //if no. is not zero 
         {
           st--;
           p++;
         }
         while(p!=0)
         {
           p--;
           al++;
         }
         if(al>=e.length)
          al=al%e.length;
      }
    }
    return e[al];
  }
}
        
      