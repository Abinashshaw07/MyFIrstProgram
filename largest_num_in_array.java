import java.io.*;
public class largest_num_in_array {
    public void main()throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size of array");
    int n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    int max=0;
    for(int i=0;i<n;i++)
    {
        a[i]=Integer.parseInt(br.readLine());

    }
max=a[0];
    for(int i=0;i<n;i++)
    {
if(a[i]>max)
{
    max=a[i];
}
}
System.out.println("The largest number in the array is: "+max);
}}