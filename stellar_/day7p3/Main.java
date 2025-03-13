import java.util.*;
class vehicle
{
    void move(String a)
    {
        System.out.println(a);
    }
}
class motorbike extends vehicle
{
    void move(String b)
    {
        System.out.println(b);
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    String b=sc.nextLine();
	    vehicle obj1=new vehicle();
	    motorbike obj2=new motorbike();
	    obj1.move(b);
	    obj2.move(a);
		
			}
}
