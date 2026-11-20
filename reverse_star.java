import java.io.*;
class reverse_star {
public void main()throws IOException
 {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of rows");
int n=Integer.parseInt(br.readLine());
for(int i=n;i>=1;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("* 5");
    }
    System.out.println();
}}}
