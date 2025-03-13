import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int N = s.nextInt();
	    if(N>=85)
	    {
	        System.out.println("GRADE A");
	    }
	    else if(N>=75)
	    {
	        System.out.println("GRADE B");
	    }
	    else if(N>=65)
	    {
	        System.out.println("GRADE C");
	    }
	    else
	    {
	        System.out.println("GRADE D");
	    }
	}
}
