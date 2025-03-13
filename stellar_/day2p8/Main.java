import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum,x=0,y=0,i;
		for(i=a;i<b;i++){
		    x = i/10;
		    y = i%10;
		    sum = ((y+x)+(y*x));
		    if(i == sum)
		    {
		        System.out.println(i);
		    }
		}
	}
}
