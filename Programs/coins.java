import java.util.*;
class coins
{
  public static void main(String ar[])throws Exception
  {
    Scanner z=new Scanner(System.in);
    System.out.println("5,10,20,50");
    System.out.println("Entre available no. of coins and amount");
    int co[]={z.nextInt(),z.nextInt(),z.nextInt(),z.nextInt()};
    int am=z.nextInt(),s=0;
    int va[]=new int[4];
    
    boolean n=money(co,va,am);
    if(n)
    {
      for(int x=0;x<4;x++)
      {
        System.out.print(va[x]+" ");
        s=s+va[x];
      }
      System.out.print(s);
    }
    else
    System.out.println("-1");
  }
  public static boolean money(int co[],int va[],int mo)
  {
    boolean g=true;
    int x=0;
    while(g)
    {
      for(x=co[3];x>0;x--)
      {
        if((x*50)<=mo)
        {
          mo=mo-x*50;
          va[3]=x;
          break;
        }
      }
      for(x=co[2];x>0;x--)
      {
        if((x*20)<=mo)
        {
          mo=mo-x*20;
          va[2]=x;
          break;
        }
      }
      for(x=co[1];x>0;x--)
      {
        if((x*10)<=mo)
        {
          mo=mo-x*10;
          va[1]=x;
          break;
        }
      }
      for(x=co[0];x>0;x--)
      {
        if((x*5)<=mo)
        {
          mo=mo-x*5;
          va[0]=x;
          break;
        }
      }
      if(mo==0)
       return g;
      g=false;
    }
  return g;
  }
}