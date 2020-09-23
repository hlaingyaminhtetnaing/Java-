public class Cars {
    public static void main(String[] args)
    {
        Car car=new Car("Toyota","Wish",7);//object
  //      car.make="Toyota";
  //      car.model="Wish";
   //     car.numberDoors=4;
        car.Detail();
        Car ca=new Car("Toyota","Wish");
        ca.Detail();
    }
}
class Car{//class
    String make;
    String model;
    int numberDoors;
    Car(String make){
        this.make=make;//constructor
    }
    Car(String make,String model)
    {
        this(make,model,6);
    }
    Car(String make,String model,int numberDoors)
    {
        this.make=make;
        this.model=model;
        this.numberDoors=numberDoors;
    }
    void Detail()
    {
        System.out.println("Cars Make : "+this.make);
        System.out.println("Cars Model : "+this.model);
        System.out.println("Cars Number Doors : "+this.numberDoors);
    }

}
