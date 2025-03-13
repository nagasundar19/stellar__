import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("email : ");
	    String a=s.nextLine();
	    if(a.contains("com") || (a.contains("in") || (a.contains("net"))))
	    {
	        System.out.println("valid email address");
	    }
	    else
	    {
	        System.out.println("Not a valid email address");
	    }
	}
}
