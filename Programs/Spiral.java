import java.io.*;
class spiral
{public static void main(String ar[])throws IOException
 { DataInputStream z=new DataInputStream(System.in);
   System.out.println("enter Dimension");
   int a=Integer.parseInt(z.readLine());
   int b=Integer.parseInt(z.readLine());
   System.out.println();
   int x[][]=new int[a][b];
   int c=0,q=1,d,e,g=0,f=1,i=0,j=0,i1=0,i2=0,i3=0,j1=0,j2=0,j3=0,c1=0,c2=0,k=0,u=0,u1=1,u2=0,u3=0,c3=1,c4=0;
   c=1;u2=b-2;u3=a-1;
   if(a>b)
    g=b*2;
   if(b>=a)
    g=a*2-1;
   for(e=0;e<g;e++)
   {       
     
     if(c<4)
       c=q;
      else
      { q=1;
        c=1;
      }
      
      q=q+1;
     switch(c)
     {
       case 1:
       for(i=c1;i<a;i++)
       { 
         for(j=u;j<b-c1;j++)
         { x[i][j]=++k;
         }
         c1++;
         u++;
         break;
       }
       break;

       case 2:

       for(j1=(b-u1);j1>0;j1--)
       { 
         for(i1=u1;i1<(a-c2);i1++)
         { x[i1][j1]=++k;
         }  
               
         c2++;
         u1++;
         break;
      }
       break;

       case 3:

       for(i2=(a-c3);i2>0;i2--)
       {
        for(j2=u2;j2>=c3;j2--)
        { x[i2][j2]=++k;
        }
        
        c3++; 
        u2--;
        break;
       }
       break;

       case 4:

       for(j3=c4;j3<b;j3++)
       {
        for(i3=u3;i3>c4;i3--)
        { x[i3][j3]=++k;
        }
        
        c4++; 
        u3--;
        break;
       }
       break;
       
     }
    
    }
    c=0;
    for(i=0;i<a;i++)
    { for(j=0;j<b;j++)
      { 
        if(x[i][j]<10)
        System.out.print(x[i][j]+"  ");
        else
        System.out.print(x[i][j]+" ");
      }
      System.out.println();
    }
   }
}