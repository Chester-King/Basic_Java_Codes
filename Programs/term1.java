import java.util.*;
class term1 {
public static void main(String ar[])throws Exception
 {
  Scanner z=new Scanner(System.in);
  int t=z.nextInt();
  int x[]=new int[t];
  int y[]=new int[t];
  for(int c=0;c<t;c++)
  {
   x[c]=z.nextInt();
   y[c]=z.nextInt();
  }
 for(int m=0;m<t;m++)		  	
  pin(x[m],y[m]); 
 
 
}
public static void pin(int a,int b)
{int x=0,y=0,xy[][]=new int[a][b],i=0,j=0,c=0;
 for(x=0;x<a;x++)
 {for(y=0;y<b;y++)
	 {for(i=x-1;i<x+2;i++)
	 {
		 for(j=y-1;j<y+2;j++)
		 {if(i==x && j==y)
			 continue;
			try
			{
				if(xy[i][j]==0)
				 ++c;
			}
			catch(Exception E){}
		 }
	 }
	 
	 }}
 System.out.println(c);
}
}
