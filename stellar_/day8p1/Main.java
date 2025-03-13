import java.util.*;
abstract class complex
{
    abstract float real(float r1,float i1,float r2,float i2);
    abstract float image(float r1,float i1,float r2,float i2);
    abstract float real1(float r1,float i1,float r2,float i2);
    abstract float image1(float r1,float i1,float r2,float i2);
}
class add extends complex
{
    float real(float r1,float i1,float r2,float i2)
    {
        return r1+r2;
    }
    float image(float r1,float i1,float r2,float i2)
    {
        return i1+i2;
    }
    float real1(float r1,float i1,float r2,float i2)
    {
        return 0;
    }
    float image1(float r1,float i1,float r2,float i2)
    {
        return 0;
    }
}
class sub extends complex
{
    float real(float r1,float i1,float r2,float i2)
    {
        return r1-r2;
    }
    float image(float r1,float i1,float r2,float i2)
    {
        return i1-i2;
    }
    float real1(float r1,float i1,float r2,float i2)
    {
        return 0;
    }
    float image1(float r1,float i1,float r2,float i2)
    {
        return 0;
    }
}
class mul extends complex
{
    float real(float r1,float i1,float r2,float i2)
    {
        return 0;
    }
    float image(float r1,float i1,float r2,float i2)
    {
        return 0;
    }
    float real1(float r1,float i1,float r2,float i2)
    {
        if((r1*r2)>(i1*i2))
            return((r1*r2)-(i1*i2));
        else
            return((i1*i2)-(r1*r2));
    }
    float image1(float r1,float i1,float r2,float i2)
    {
        return ((r1*i1)+(i1*r2));
    }
}
class div extends complex
{
    float real(float r1,float i1,float r2,float i2)
    {
        return 0;
    }
    float image(float r1,float i1,float r2,float i2)
    {
        return 0;
    }
    float real1(float r1,float i1,float r2,float i2)
    {
        return (((r1*r2)+(i1*i2)/((r2*r2)+(i2*i2))));
    }
    float image1(float r1,float i1,float r2,float i2)
    {
        float a=i1*r2;
        float b=i2*r1;
        if(a>b)
        return((a-b)/((r2*r2)+(i2*i2)));
        else
        return((b-a)/((r2*r2)+(i2*i2)));
    }
}
public class Main {
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float r1=sc.nextFloat();
        float i1=sc.nextFloat();
        float r2=sc.nextFloat();
        float i2=sc.nextFloat();
        complex obj;
        obj = new add();
        System.out.println(obj.real(r1,i1,r2,i2));
        System.out.println(obj.image(r1,i1,r2,i2));
        obj = new sub();
        System.out.println(obj.real(r1,i1,r2,i2));
        System.out.println(obj.image(r1,i1,r2,i2));
        obj = new mul();
        System.out.println(obj.real1(r1,i1,r2,i2));
        System.out.println(obj.image1(r1,i1,r2,i2));
        obj = new div();
        System.out.println(obj.real1(r1,i1,r2,i2));
        System.out.println(obj.image1(r1,i1,r2,i2));
    }
}

