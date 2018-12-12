import java.io.*;
import java.util.*;
class File20
{
 public static void main(String arr[])throws Exception
{
Scanner z=new Scanner(System.in);
int a=z.nextInt(),b=z.nextInt();
int mat[][]=new int[a][b];
int x=0,y=0,c=0,p=0,q=0,t=0;
for(x=0;x<a;x++)
 for(y=0;y<b;y++)
  mat[x][y]=z.nextInt();
int soa[]=new int[(a-2)*(b-2)];
for(x=1;x<a-1;x++)
 for(y=1;y<b-1;y++)
  soa[c++]=mat[x][y];
c=0;
for(q=0;q<soa.length-1;q++)
{ for(p=q;p<soa.length;p++)
  { if(soa[p]<soa[q])
     { t=soa[p];
       soa[p]=soa[q];
       soa[q]=t;
     }
  }
}
for(x=0;x<a;x++)
 {for(y=0;y<b;y++)
  System.out.print(mat[x][y]+" ");
System.out.println();
}
for(x=1;x<a-1;x++)
 for(y=1;y<b-1;y++)
  mat[x][y]=soa[c++];
for(x=0;x<a;x++)
 {for(y=0;y<b;y++)
  System.out.print(mat[x][y]+" ");
System.out.println();
}

}
}
