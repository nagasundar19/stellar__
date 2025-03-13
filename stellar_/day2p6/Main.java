import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=0,b=0,c=1,d;
	    int n=s.nextInt();
	    System.out.print(a+" "+b+" "+c+" ");
	    while(n>3)
	    {
	       d = a+b+c;
	       System.out.print(d+" ");
	       a=b;
	       b=c;
	       c=d;
	       n--;
	    }
	    
	}
}
