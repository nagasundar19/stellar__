import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int m=n/10;//164 / 10 = 16
	    int middle=m%10;//16%10 = 6
	    if(middle%3==0)// 6%3==0
	    {
	        System.out.println("it is trendy number");
	    }
	    else
	    {
	        System.out.println("it is not a trendy number");
	    }
	}
}
