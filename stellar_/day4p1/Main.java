import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String a=s.nextLine();
	    int count=0;
	    String A=a.toLowerCase();
	    for(int i=0;i<A.length();i++)
	    {
	        if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u')
	        {
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}
