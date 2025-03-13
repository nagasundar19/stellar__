import java.util.*;
class test 
{
    void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    void mul(int c,int d,int e)
    {
        System.out.println(c*d*e);
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		test t=new test();
		t.mul(a,b);
		t.mul(c,d,e);
	}
}
