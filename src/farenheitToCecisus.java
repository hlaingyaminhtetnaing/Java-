import java.util.Scanner;

public class farenheitToCecisus {
    public static void main(String[] args) {
        Scanner faren = new Scanner(System.in);
        System.out.print("Enter Celsius :");

        double farenheit = faren.nextDouble();
//        System.out.println(farenheitToCelsius(farenheit)+"'C");
//        printTemperature(farenheit);
        farenheitToCecisus fahren = new farenheitToCecisus();
        double ce = fahren.f2c(farenheit);
        fahren.printFTemperature(ce);
        Scanner cel = new Scanner(System.in);
        System.out.print("Enter Fahrenheit:");

        double celSius = cel.nextDouble();
        farenheitToCecisus celsius = new farenheitToCecisus();
        celsius.c2f(345);
        double fa = celsius.c2f(456.00);
        fahren.printCTemperature(fa);

    }

    double f2c(double fahren) {
        double Celsius = 0;
        Celsius = (fahren - 32) * 5 / 9;
        //int Cel=(int)Math.round(Celsius);
        return Celsius;
    }

    double c2f(double celsius) {
        double fahren = 0;
        double fa = 32 + (celsius * 9 / 5);
        return fa;
    }

    void printCTemperature(double temp) {
        System.out.println("Celsius " + temp + "C");
    }

    void printFTemperature(double temp) {
        System.out.println("Fahrenheit " + temp + "F");
    }
//    public static double farenheitToCelsius(double num)
//    {
//        double Celsius=0;
//        Celsius=(num-32)*5/9;
//        int Cel=(int)Math.round(Celsius);
//        return Cel;
//    }
    // printTemperature(double printfarenheit)
//    {
//        System.out.print(printfarenheit+"'F");
//    }
}

