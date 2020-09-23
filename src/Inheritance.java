public class Inheritance {
    public static void main(String [] args)
    {
        Programmer programmer=new Programmer();
        programmer.Salary=100000;
        programmer.bonus=40000;
        System.out.println("Programmer Salary : "+programmer.Salary);
    }
}
class Employee{
    float Salary;
}
class Programmer extends Employee
{
    float bonus;
}
class JavaProgrammer extends Programmer
{
    float allowance;
}
