import java.io.*;
class nth_prime_number
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n");
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int c=0;
        int d=1;
         for(;;)
        {d=d+1;
       if(prime(d)==true)
       {
        a[c]=d;
        c++;
       }
    if(c==n)
    {
        System.out.println("The " + n + "th prime number is: " + a[n-1]);
        break;
    }
   
}
        }
        static boolean prime(int x)
        {boolean t=false;int m=0;
            for(int i=1;i<=x;i++)
            {
                if(x%i==0)
                {
                    m=m+1;
                }}
                if(m==2)
                {
                    t=true;
                }
                return t;
            }
       
       }