/* WAP a program to convert a number from one system to another and also a basic calculator. */
import java.io.*;
import java.util.*;
class base
{
  static String DecToOth(int a,int b)                // Decimal to binary
  {
    int c;
    String s="";
    while(a>=b)
    {
      c=a%b;
      a=a/b;
      if(c>=10)
      s=(char)('A'+c-10)+s;
      else
      s=""+c+s;
    }
    if(a>=10)
    s=(char)('A'+a-10)+s;
    else
    s=""+a+s;
    return s;
  }
  
  static int OthToDec(String s,int b)                 // binary to decimal
  {
    int i,l=s.length(),m=0,S=0;
    char c;
    for(i=l-1;i>=0;i--,m++)
    {
      c=s.charAt(i);
      if(c-'A'>=0)
      S=S+(c-'A'+10)*(int)Math.pow(b,m);
      else
      S=S+(c-'0')*(int)Math.pow(b,m);
    }
    return S;
  }
  
  static String Sub(String s1,String s2,int b)                          // subtraction
  {
    int i,j,l1=s1.length(),l2=s2.length();
    String s="",a="",s3;
    char c;
    if(b==16)
    {
      for(j=0;j<l2;j++)
      {
        c=s2.charAt(j);
        if(c>64)
        a=a+(char)('F'-c+48);
        else if(c-48<6)
        a=a+(char)(119-c);
        else
        a=a+(char)(63-c);
      }
      for(j=l2;j<l1;j++)
      a="F"+a;
    }
    else
    {
      for(i=1;i<=l2;i++)
      s=s+(b-1);
      for(i=l2;i<l1;i++)
      s=s+(b-1);
      a=(Integer.parseInt(s)-Integer.parseInt(s2))+"";
    }
    System.out.println(a);
    s3=Add(a,s1,b);
    if(s3.length()>a.length() || s3.length()>s1.length())
    {
      s3=s3.substring(1);
      s3=Add("1",s3,b);
    }
    else
    {
      if(b==16)
      {
        for(j=0;j<s3.length();j++)
        {
          c=s3.charAt(j);
          if(c>64)
          a=a+(char)('F'-c+48);
          else if(c-48<6)
          a=a+(char)(119-c);
          else
          a=a+(char)(63-c);
        }
      }
      else
      {
        for(i=1;i<=s3.length();i++)
        s=s+(b-1);
        a=(Integer.parseInt(s)-Integer.parseInt(s1))+"";
      }
    }
    s3="-"+a;
    return s3;
    
  }
  
  static String Add(String s1,String s2,int b)                          // addition
  {
    int i,j,l1=s1.length(),l2=s2.length(),S1,S2,S3,m=1;
    String c1,c2,C="",p;
    char s;        
    for(i=l1-1,j=l2-1;i>=0 && j>=0;i--,j--,m++)
    {
      c1=""+s1.charAt(i);
      c2=""+s2.charAt(j);
      S1=OthToDec(c1,b);
      S2=OthToDec(c2,b);
      S3=S1+S2;
      if(S3<b)
      {
        if(S3>=10)
        s=(char)('A'+(S3-10));
        else
        s=(char)(S3+'0');
      }
      else
      {
        if(S3-b>=10)
        s=(char)('A'+(S3-10-b));
        else
        s=(char)((S3-b)+'0');
        p=""+(int)(Math.pow(10,m));
        s1=Add(s1,p,b);
        if(s1.length()>l1)
        i++;
      }
      C=""+s+C;
    }
    if(i>=0)
    C=""+s1.substring(0,i+1)+C;
    if(j>=0)
    C=""+s2.substring(0,j+1)+C;
    return C;
  }
  
  
  static String OH_ToBin(String s,int b)                          // hexadecimal to binary
  {
    int i,j,l=s.length(),m=0,l1,l2,k;
    char c;
    String S,q="";
    for(i=l-1;i>=0;i--,m++)
    {
      c=s.charAt(i);
      if(c-'A'>=0)
      {
        S="1001";
        for(j=1;j<=c+1-'A';j++)
        S=Add(S,"1",2);
      }
      else
      {
        S="0";
        for(j=1;j<=c-'0';j++)
        S=Add(S,"1",2);
      }
      l2=S.length();
      if(b==8)
      l1=3;
      else
      l1=4;
      for(k=l2;k<l1 && i>0 ;k++)
      S="0"+S;
      q=S+q;
    }
    return q;
  }
  
  
  static String BinTo_OH(String s,int b)                            // binary to hexadecimal
  {
    int i,a,c,f,l=s.length();
    String s1,S="";
    if(b==8)
    a=3;
    else
    a=4;
    for(i=0;i<Math.ceil(s.length())/a;i++)
    {
      if(l-i*3-a<0)
      c=0;
      else
      c=l-i*a-a;
      s1=s.substring(c,l-i*a);
      f=OthToDec(s1,2);
      S=DecToOth(f,b)+S;
    }
    return S;
  }
  
  
  
  
  public static void main(String ar[])
  {
    Scanner st=new Scanner(System.in);
    
    String s,s1,s2;
    int a,b,f,t,S,p;
    do
    {
      
      System.out.println("enter 1 for convertion \n2 for calculations");
      p=st.nextInt();
      switch(p)
      {
        case 1:
        System.out.println("enter the choice as FROM TO\n1-binary\n2-decimal\n3-octal\n4-hexadecimal");
        f=st.nextInt();
        t=st.nextInt();
        System.out.println("Enter the no.");
        s=st.next();
        
        
        
        switch(f)                                                            // switching cases
        {
          case 2:
          a=Integer.parseInt(s);
          if(t==1)
          b=2;
          else if(t==2)
          b=10;
          else if(t==3)
          b=8;
          else if(t==4)
          b=16;
          else
          {
            System.out.println("invalid choice");
            break;
          }
          s1=DecToOth(a,b);
          System.out.println(s1);
          break;
          
          case 1:
          if(t==1)
          System.out.println(s);
          else if(t==2)
          {
            S=OthToDec(s,2);
            System.out.println(S);
          }
          else if(t==3)
          {
            b=8;
            s1=BinTo_OH(s,b);
            System.out.println(s1);
          }
          else if(t==4)
          {
            b=16;
            s1=BinTo_OH(s,b);
            System.out.println(s1);
          }
          else
          System.out.println("invalid choice");
          break;
          
          case 3:
          if(t==1)
          {
            b=8;
            s1=OH_ToBin(s,b);
            System.out.println(s1);
          }
          else if(t==2)
          {
            S=OthToDec(s,8);
            System.out.println(S);
          }
          else if(t==3)
          System.out.println(s);
          else if(t==4)
          {
            b=8;
            s1=OH_ToBin(s,b);
            b=16;
            s2=BinTo_OH(s1,b);
            System.out.println(s2);
          }
          
          else
          System.out.println("invalid choice");
          break;
          
          case 4:
          s=s.toUpperCase();
          if(t==1)
          {
            b=16;
            s1=OH_ToBin(s,b);
            System.out.println(s1);
          }
          else if(t==2)
          {
            S=OthToDec(s,16);
            System.out.println(S);
          }
          else if(t==3)
          {
            s1=OH_ToBin(s,16);                                                                                                          
            s2=BinTo_OH(s1,8);
            System.out.println(s2);
          }
          else if(t==4)
          System.out.println(s);
          else
          System.out.println("invalid choice");
          break;
          
          default:
          System.out.println("invalid choice");
          
        }
        break;
        
        
        case 2:
        System.out.println("enter the choice\n1-add\n2-subtract\n3_multiply\n4-divide");
        f=st.nextInt();
        System.out.println("enter the base\n1-binary\n2-decimal\n3-octal\n4-hexadecimal");
        t=st.nextInt();
        System.out.println("Enter the 2 no.");
        s1=(st.next()).toUpperCase();
        s2=(st.next()).toUpperCase();
        switch(f)                                                     // switching cases
        {
          case 1:
          if(t==1)
          b=2;
          else if(t==2)
          b=10;
          else if(t==3)
          b=8;
          else if(t==4)
          b=16;
          else
          {
            System.out.println("invalid choice");
            break;
          }
          s=Add(s1,s2,b);
          System.out.println(s);
          break;
          case 2:
          if(t==1)
          b=2;
          else if(t==2)
          b=10;
          else if(t==3)
          b=8;
          else if(t==4)
          b=16;
          else
          {
            System.out.println("invalid choice");
            break;
          }
          s=Sub(s1,s2,b);
          System.out.println(s);
          break;
          
        }
      }
    }
    while(p!=0);
  }
}

