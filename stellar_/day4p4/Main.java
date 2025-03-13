import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the statement");
	    String a=s.nextLine();
	    String res = a.replace(" ","");
		System.out.println(res);
	}
}
