import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        // write your code here
        Scanner result=new Scanner(System.in);
        System.out.print("Enter Number:");
        int marks=result.nextInt();
        Result(marks);
    }
    public static void Result(int marks)
    {
        if(marks>=0 && marks<=19)
        {
            System.out.println("Grade E");
        }else
        if(marks>=20 && marks<=39)
        {
            System.out.println("Grade D");
        }else
        if(marks>=40 && marks<=59)
        {
            System.out.println("Grade C");
        } else if(marks>=60 && marks<=79)
        {
            System.out.println("Grade B");
        }
        else if(marks>=80 && marks<=100)
        {
            System.out.println("Grade A");
        }
        else {
            System.out.println("Error");
        }
    }
}
