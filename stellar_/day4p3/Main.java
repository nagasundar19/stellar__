import java.util.*;
public class Main 
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        StringBuffer b = new StringBuffer(a).reverse();
        if(a.equals(b.toString()))
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}