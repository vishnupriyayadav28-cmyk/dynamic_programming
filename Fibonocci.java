class Demo15
{
    int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
public class Fibonocci {
    public static void main(String args[])
    {
        Demo15 d=new Demo15();
        int n=4;
        for(int i=0;i<=n;i++)
        {
        System.out.println(d.fib(i));
        }

    }
    
}
