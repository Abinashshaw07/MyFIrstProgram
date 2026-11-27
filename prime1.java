import java.io.*;
class prime1
{
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number");
        prime1 p=new prime1();
        for(;;)
        {
            int x=Integer.parseInt(br.readLine());
        p.prime(x);
    if(x==7)
    {
        break;
    }
    }}
    void prime(int m)
    {int c=0;
        for(int i=1;i<=m;i++)
        {
            if(m%i==0)
            {
                c=c+1;
            }}
                if(c==2)
                {
                    System.out.println("Prime");
                }
                else
                {
                    System.out.println("Not Prime");
            }
        }
    }
