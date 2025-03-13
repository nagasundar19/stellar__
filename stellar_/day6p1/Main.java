import java.util.*;
class parent
{
    public void sum(int a,int b)
    {
        System.out.println(a+b);
    }
}
class child1 extends parent
{
    public void sub(int a,int b)
    {
        System.out.println(a-b);
    }
}
class child2 extends parent
{
    public void mul(int a,int b)
    {
        System.out.println(a*b);
    }
}
class child3 extends child2
{
    public void div(int a,int b)
    {
        System.out.println(a/b);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    child1 obj = new child1();
	    child3 obj1 = new child3();
	    obj.sum(a,b);
	    obj.sub(a,b);
	    obj1.mul(a,b);
	    obj1.div(a,b);
		
	}
}
