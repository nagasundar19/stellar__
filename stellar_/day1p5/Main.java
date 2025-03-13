import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String a=s.nextLine();
	    String b=s.nextLine();
	    int c=s.nextInt();
	    char v=s.next().charAt(0);
	    Double d =s.nextDouble();
		System.out.println("Event Name :" +a);
		System.out.println("Event Type :" +b);
		System.out.println("Expected count :" +c);
		System.out.println("paid entry or not :" +v);
		System.out.println("Total expanses :" +d);
	}
}
