import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a = s.nextInt();
	    if(a%10==3)
	    {
	        System.out.println("you are a lucky winner");
	    }
	    else if(a%10==8)
	    {
	        System.out.println("you are a lucky winner");
	    }
	    else
	    {
	        System.out.println("better luck next time");
	    }
	}
}
