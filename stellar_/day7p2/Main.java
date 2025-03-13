import java.util.*;
import java.util.*;
class tests 
{
    void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    void mul(double c,double d)
    {
        System.out.println(c*d);
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		tests t=new tests();
		t.mul(a,b);
		t.mul(c,d);
	}
}

