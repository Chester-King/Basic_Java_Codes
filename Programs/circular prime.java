/* WAP to input a number and check whether the number is a circular prime or not? */
import java .io.*;
class circularprime
{
  public static void main(String args[])throws IOException
  {
  DataInputStream z=new DataInputStream(System.in);
  System.out.print(" N = ");
  int N=Integer.parseInt(z.readLine());
  System.out.println();
  int j;
  for(j=1;(int)(N/(Math.pow(10,j)))>0;j++);
  cprime(N,j);
}
public static void cprime(int N,int j)
{
  int x=N,c=0;
  for(int k=1;k<=j;k++)
  {
   System.out.println(x);
   if(prime(x))
    c++;

   x=(int)(x/Math.pow(10,(j-1)))+(int)(x%Math.pow(10,(j-1)))*10;
}
if(c==0)
   System.out.println(N+" IS A CIRCULAR PRIME");
  else
   System.out.println(N+" IS NOT A CIRCULAR PRIME");
}
public static boolean prime(int x)
{
  int i;
  for(i=2;i<x/2;i++)
   if(x%i==0)
    break;
    if(i==x/2)
    return false;
    else
    return true;
 }
}

