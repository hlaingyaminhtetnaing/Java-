public class Methods {
    int add(int a,int b)
    {
        System.out.println("Add(int,int) Method called");
        return a+b;
    }
    int add(int a,int b,int c)//MethodOverloading
    {
        System.out.println("Add(int,int,int) Method called");
        return a+b+c;
    }
    double add(double a,double b)
    {
        System.out.println("Add(double,double Method called");
        return a+b;
    }
    public static  void main(String[] args)
    {
        Methods methods=new Methods();
        int result=methods.add(10 ,20);
        System.out.println("Result : "+result);
        Methods method=new Methods();
        int re=method.add(10 ,20,50);
        System.out.println("Result : "+re);
        Methods methodss=new Methods();
        double rs=methodss.add(12.22,23.43);
        System.out.println("Result : "+rs);
    }
}
