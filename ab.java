import java.io.*;
class ab
{
    public void main()throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter any number");
    int n=Integer.parseInt(br.readLine());
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}}