public class Aggreation {
    public static void main(String[] args)
    {
        Address yangon=new Address("Yangon");
        Address Mandalay=new Address("Mandalay");
        Student stu=new Student("Hlaing",yangon);
        stu.printDetails();
        //System.out.println(stu.studentAddress.city);
    }
}
class Address
{
    String city;
    Address(String city)
    {
        this.city=city;
    }
}
class Student
{
    String name;
    Address studentAddress;
    Student(String name,Address address)
    {
        this.name=name;
        this.studentAddress=address;

    }
    void printDetails()
    {
        System.out.println("Student Name : "+name);
        System.out.println("Student Address : "+studentAddress);

    }
}