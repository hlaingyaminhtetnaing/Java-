public class abstractSample {
    public static void main(String[] args)
    {
    Students stu=new Cu("Mg Mg");
    System.out.println(stu.getCity());
        System.out.println(stu.name);
    }
}
abstract class Students
{
    String name;
    abstract String getCity();
    String Major()
    {
        return "CS";
    }
}
class  Cu extends Students{
    String name;
 Cu(String name)
 {
      this.name=name;

 }
    @Override
    String getCity() {
        return "Yangon";
    }
}
