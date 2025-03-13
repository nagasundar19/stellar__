import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=a.toLowerCase();
		int A = a.length();
		if(A%2==1)
		{
		   int n=A/2;
		   System.out.println(a.charAt(n));
		}
		else
		{
		    int n=A/2;
		    System.out.println(a.charAt(n-1)+" "+a.charAt(n));
		}
		}
	}
