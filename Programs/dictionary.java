
//Input a string of length l and n words.Print number of words present in the string.
import java.io.*;
import java.util.*;
class strt
{
  public static void main(String ar[])throws Exception
  { 
    DataInputStream z=new DataInputStream(System.in);
    int a=0,m=0,b=0;
    String sa="";
    a= Integer.valueOf(z.readLine());//inputting length and number of words
    b=Integer.valueOf(z.readLine());
    sa=z.readLine();
    String dir[]=new String[b];
    for(int x=0;x<b;x++)//inputting words
    {
      dir[x]=z.readLine();
    }
    int c=0,p=0;
    for(int y=0;y<b;y++)//checking number of words present
    {
      p=dir[y].length();
      for(m=0;m<=sa.length()-p;m++)
      {
        if(dir[y].equalsIgnoreCase(sa.substring(m,m+p)))
         ++c;
      }
    }  
    System.out.println(c);
  }
}  



















