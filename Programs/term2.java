import java.util.*;
class term2 {
	public static void main(String ar[])throws Exception
	{
	 Scanner z=new Scanner(System.in);
	 int f=0,t=z.nextInt();
	 int x[]=new int[t];
	 for(int y=0;y<t;y++)
	  x[y]=z.nextInt();
	 for(int m=0;m<t;m++)
	 {
	   f=pin(x[m]);
	   System.out.println(f);
	 }
	}
 public static int pin(int a)
 {
	int n=1,m=a/5,l=0;
	if(m==0)
	 return 0;
	else
	{
	while(a/(Math.pow(5,n))>=1)
	{
	 l=l+(int)(a/(Math.pow(5,n)));
	 n++;
	}	
	return l;
	}
 }
}
