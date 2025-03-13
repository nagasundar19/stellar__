import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int y = s.nextInt();
	    int givenyear = 1900;
	    int ry=0;
	    int ly=0;
	    y=(y-1)-givenyear;
	    ly=y/4;
	    ry=y-ly;
	    int totaldays=(ry*365)+(ly*366)+1;
	    int days = totaldays%7;
	    if (days==0)
	    {
	        System.out.println("Monday");
	    }
	    else if(days==1)
	    {
	        System.out.println("Tuesday");
	    }
	    else if(days==2)
	    {
	        System.out.println("Wednesday");
	    }
		else if(days==3)
		{
		    System.out.println("Thursday");
		}
		else if(days==4)
		{
		    System.out.println("Friday");
		}
		else if(days==5)
		{
		    System.out.println("Saturday");
		}
		else if(days==6)
		{
		    System.out.println("Sunday");
		}
	}
}
