import java.io.*;
class stack
{
  private int T;
  private int a[];
  int N;
  void push(int k)
  { if(T==N-1)
     System.out.println("overflow");
    else
     a[++T]=k;
  }
  stack(int S)
  { T=-1;
    N=S;
    a=new int[S];
  }
  int pop()
  { if(T==-1)
     return -99;
    else
    { int M=a[T];
      T--;
      return M;
    }
  }

 public static void main(String ar[])throws IOException
  { DataInputStream z=new DataInputStream(System.in);
    System.out.println("enter size of array");
    int a=Integer.parseInt(z.readLine());
    stack k=new stack(a);
    int d,c,s;
    
    boolean t=true;
    while(t==true)
    {
     System.out.println("enter choice 1.push and 2.pop 3.exit");
     s=Integer.parseInt(z.readLine());
     switch(s)
     {
      case 1:
      d=Integer.parseInt(z.readLine());
      k.push(d);
      break;

      case 2:
      c=k.pop();
      if(c==-99)
      System.out.println("underflow");
      else
      System.out.println(c);
      break;

      case 3:
       t=false;
      break;

      default:
       System.out.println("Wrong choice");
     }
    }
  }
}

      
 
