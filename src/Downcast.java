public class Downcast extends A{
    static void method(A a)
    {
        Downcast d=(Downcast)a;
        System.out.println("Downcasting..............");
    }
    public static void main(String[] args)
    {
        A a=new Downcast();
        Downcast.method(a);
    }
}
class A
{

}
