import java.util.*;
class lowestfraction
{
  public static void main(String ar[])throws Exception{
    Scanner z=new Scanner(System.in);
    System.out.println("Entre fraction");
    boolean g=true;
    String s=z.next();
    String a1="",b1="";
    for(int y=0;y<s.length();y++)
    {
      if(s.charAt(y)=='/')
      {
        g=false;
        continue ;
      }
      if(g)
      a1=a1+s.charAt(y);
      else
      b1=b1+s.charAt(y);
    }
    int a=Integer.valueOf(a1),e=0;
    char d=0;
    int b=Integer.valueOf(b1);
    int c=a>b?b:a;
    for(int x=1;x<=c;x++)
    if(a%x==0 && b%x==0)
    e=x;
    a=a/e;
    b=b/e;
    System.out.println(a+"/"+b);
  }
}