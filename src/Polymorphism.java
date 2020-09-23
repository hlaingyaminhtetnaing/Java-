public class Polymorphism {
    public  static  void main(String[] args)
    {
        Rectangle re=new Rectangle();
        re.draw();
        Shape s=new Rectangle();//Upcasting
        s.draw();
        Circle c=new Circle();
        c.draw();
        Shape shape=new Shape();
        if (shape instanceof Circle)
        {
            Circle ci=(Circle)shape;
            ci.draw();
        }
        System.out.println(shape instanceof Shape);

    }
}
class Shape{
    void draw(){
        System.out.println("Drawing.........");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing.. Rectangle.......");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing.. Circle.......");
    }
}
