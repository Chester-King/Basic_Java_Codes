import java.io.*;
import java.util.*;
class Farmers
{
  public static void main(String ar[])throws Exception
  {    
    Scanner z=new Scanner(System.in);
    int c=0,d=0,v=0,w=0,ka=0,ch=0,a=z.nextInt(),b=z.nextInt(),p=0,q=0;
    int no=z.nextInt(),la1[]=new int[no],la2[]=new int[no];
    int iail[][]=new int[a][b];
    for(int x=0;x<no;x++)
    { la1[x]=z.nextInt();la2[x]=z.nextInt(); }
    for(int y=0;y<no;y++)
    {
      c=la1[y];d=la2[y];
      for(p=c-1;p<c+2;p++)
      {
        for(q=d-1;q<d+2;q++)
        { try
          { iail[p][q]=iail[p][q]+1;}
          catch(Exception E){continue;}
        }
      }
    }
    for(ka=0;ka<no;ka++)
    { ch=0;
      v=la1[ka];w=la2[ka];
      A: for(p=v-1;p<v+2;p++)
      {
        for(q=w-1;q<w+2;q++)
          { try{             
            if(iail[p][q]>1)
            {ch++;iail[p][q]--; }
            else
             continue A; }
          catch(Exception E){ ch++;}                
        } 
      }
      if(ch==9)
      { System.out.println("Remove lamp("+v+","+w+")");la1[ka]=-1;la2[ka]=-1;
      } 
    }  
  }  
}    
    
    
  