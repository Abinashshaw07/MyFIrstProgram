import java.io.IOException;
import java.util.*;
class just
{
    public void main()throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number?");
        int x=sc.nextInt();
        just ob=new just();
        ob.peri(x);
        ob.area(x);
    sc.close();
    }
    void peri(int a)
    {
        double m=2*3.14*a;
        System.out.println("The perimeter is :"+m);
    }
    void area(int k)
    {
        double s=3.14*k*k;
        System.out.println("The area is :"+s);
    }
}