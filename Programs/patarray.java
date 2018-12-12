import java.util.*;
class reararray {
public static void main(String ar[])throws Exception
{
	Scanner z=new Scanner(System.in);
	int a=z.nextInt(),c1=-1,c2=a;
	int k[][]=new int[a][a];
	int x=0,y=0;
	for(x=0;x<a;x++)
	{c1++;c2--;
	 for(y=0;y<a;y++)
	 {
	  if(x==y || (a-x-1)==y)
	   System.out.print("+");
	  if(x<(a/2) && (y>c1 && y<c2))
	   System.out.print("@");
	  if(x>(a/2) && (y<c1 && y>c2))
	   System.out.print("-");
	  if(y<c1 && y<c2)
	   System.out.print("*");
	  if(y>c1 && y>c2)
		   System.out.print("=");
	 }
	 System.out.println();
	}
	}
}