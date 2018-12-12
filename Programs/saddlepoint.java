import java.io.*;
class saddlepoint
{ public static void main(String ar[])throws IOException
 { DataInputStream z=new DataInputStream(System.in);
   System.out.println("enter rows ad then colums of array");
   int a=Integer.parseInt(z.readLine());
   int b=Integer.parseInt(z.readLine());
   int m[][]=new int[a][b];
   int c,d,e,f,g,h=0,i=0,j;
   boolean t=true;
   for(c=0;c<a;c++)
   { for(d=0;d<b;d++)
      m[c][d]=Integer.parseInt(z.readLine());
   }

   for(c=0;c<a;c++)
   { for(d=0;d<b;d++)
     System.out.print(m[c][d]+" ");
     System.out.println();
   }
   c=0;d=0;
   while(t)
   { j=0;
     e=m[c][d];
     
     for(f=0;f<b;f++)
     { if(e>m[h][f])
        j++;
      
     }
    
     for(g=0;g<a;g++)
     { if(e>m[g][i])
        j++;
      
     }
    
     i++;
     if(j==0)
      System.out.println("Saddlepoint "+m[c][d]);

     d++;
     if(d==b)
     { d=0;
       i=0;
       h++;
       c++;
     }
     if(c==a)
      t=false;
   }
  }
 }
