/* WAP to input 2D-array and interchange the elements of its row and columns */

import java.io.*;
class transposer
{ public static void main(String ar[])throws IOException
  { DataInputStream z=new DataInputStream(System.in);
    System.out.println("Enter rows and colums");
    int a=Integer.parseInt(z.readLine());
    int m[][]=new int[a][a];
    int r=0,t=0,b,c,d=0;
    for(b=0;b<a;b++)
    { for(c=0;c<a;c++)
       m[b][c]=Integer.parseInt(z.readLine());
    }
    
    for(b=0;b<a;b++)
    { for(c=0;c<a;c++)
       System.out.print(m[b][c]+" ");
      System.out.println();
    }
    System.out.println();

    for(b=0;b<a;b++)
    { for(c=d;c<a;c++)
      {t=m[b][r];
       m[b][r]=m[r][b];
       m[r][b]=t;
       r++;
      }
      d++;
      r=d;
    }
    for(b=0;b<a;b++)
    { for(c=0;c<a;c++)
       System.out.print(m[b][c]+" ");
      System.out.println();
    }
  }
 }
