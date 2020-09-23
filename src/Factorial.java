import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        Scanner fact=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int factorial=fact.nextInt();
        System.out.println(Factorial(factorial));
    }
    public static int Factorial(int factorial)
    {
        int j=1;
        for(int i=1;i<=factorial;i++)
        {
            j=j*i;
        }
        return j;
    }
}
