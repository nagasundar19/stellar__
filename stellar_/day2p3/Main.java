import java.util.*;
public class Main
{
public static void main (String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter date of birth");
    int d = s.nextInt();
    System.out.println("Enter month of birth");
    int m = s.nextInt();
    
    if(m==1)
    {
        if(d>=1&&d<=19)
        {
            System.out.println("capricorn");
        }
        if(d<=20&&d>=31)
        {
            System.out.println("Aquarius");
        }
    }
    else if(m==2)
    {
        if(d>=1&&d<=18)
        {
            System.out.println("Aquarius");
        }
        if(d>=19&&d<=28)
        {
            System.out.println("Pisces");
        }
    }
    else if(m==3)
    {
        if(d>=1&&d<=20)
        {
            System.out.println("Pisces");
        }
        if(d>=21&&d<=31)
        {
            System.out.println("Aries");
        }
    }
    else if(m==4)
    {
        if(d>=1&&d<=19)
        {
            System.out.println("Aries");
        }
        if(d>=20&&d<=30)
        {
            System.out.println("Taurus");
        }
    }
    else if(m==5)
    {
        if(d>=1&&d<=20)
        {
            System.out.println("Taurus");
        }
        if(d>=21&&d<=31)
        {
            System.out.println("Gemini");
        }
    }
    else if(m==6)
    {
        if(d>=1&&d<=20)
        {
            System.out.println("Gemini");
        }
        if(d>=21&&d<=30)
        {
            System.out.println("Cancer");
        }
    }
    else if(m==7)
    {
        if(d>=1&&d<=22)
        {
            System.out.println("Cancer");
        }
        if(d>=23&&d<=31)
        {
            System.out.println("Leo");
        }
    }
    else if(m==8)
    {
        if(d>=1&&d<=22)
        {
            System.out.println("Leo");
        }
        if(d>=23&&d<=31)
        {
            System.out.println("Virgo");
        }
    }
    else if(m==9)
    {
        if(d>=1&&d<=22)
        {
            System.out.println("Virgo");
        }
        if(d>=23&&d<=30)
        {
            System.out.println("Libra");
        }
    }
    else if(m==10)
    {
        if(d>=1&&d<=22)
        {
            System.out.println("Libra");
        }
        if(d>=23&&d<=31)
        {
            System.out.println("Scorpio");
        }
    }
    else if(m==11)
    {
        if(d>=1&&d<=21)
        {
            System.out.println("Scorpio");
        }
        if(d>=22&&d<=30)
        {
            System.out.println("Sagittarius");
        }
    }
    else if(m==12)
    {
        if(d>=1&&d<=21)
        {
            System.out.println("Sagittarius");
        }
        if(d>=22&&d<=31)
        {
            System.out.println("Capricorn");
        }
    }
}
}