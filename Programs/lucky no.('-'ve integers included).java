import java.util.*;
class luckynonev
{
  public static void main(String ar[])throws Exception{
    Scanner z=new Scanner(System.in);
    System.out.println("Entre no. of elements");
    int e=z.nextInt();
    int n[]=new int[e];
    System.out.println("Entre elements");
    for(int x=0;x<n.length;x++)
    n[x]=z.nextInt();
    System.out.println("Entre position");
    int p=z.nextInt();
    luck(n,p);
    for(int l=0;l<n.length;l++)
    if(n[l]!=0)
    System.out.println("lucky no."+n[l]);
  }
  public static void luck(int a[],int p){
    int y=0,r=0,m=0;
    p=p-1;
    for(y=0;y<a.length-1;y++)
    {
      r=a[p];
      a[p]=0;
      m=r;
      while(r>0)
      {
        try
        {
          if(a[p+1]!=0)
          {
            r--;p++;
          }
          else
          p++;
        }
        catch(Exception M){
          if(a[0]!=0)
          {
            r--;
            p++;
          }
          else
          p++;  
        }  
        if(p==a.length)
        p=0;
      }
      while(r<0)
      {
        try
        {
          if(a[p-1]!=0)
          {
            r++;p--;
          }
          else
          p--;
        }
        catch(Exception N){
          if(a[a.length-1]!=0)
          {
            r++;
            p--;
          }
          else
          p--;  
        }  
        if(p==a.length)
        p=0;
        if(p==0)
        p=a.length-1;
      }
     }
  }
}