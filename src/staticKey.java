public class staticKey {
    public static void main(String[] args)
    {
        Counter count=new Counter();
        Counter coun=new Counter();
        University un1=new University(89);
        University un2=new University(29,"jj");
    }
}
class Counter
{
    static int count=0;
    Counter()
    {
        count++;
        System.out.println(count);
    }
}
class University
{
    final int a=20;
    final int majors;
    String name;
    public University(int major)
    {
        this.majors=major;
    }
    public University(int major,String name)
    {
        this.majors=major;
        this.name=name;
    }

}
