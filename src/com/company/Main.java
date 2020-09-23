package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String [] args)
    {

        System.out.println("Hello World");

        int numArray[]={0,1,2,3,4,5};
        for(int i=0;i<numArray.length;i++)
        {
            System.out.print(i);
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        String  num=sc.next();
        switch(num)
        {
            case "earth":
                System.out.println("10");
                break;
            case  "yuy":
                System.out.println("20");
                break;
            default:
                System.out.println("Error");
                break;

        }
        for(int i=0;i<20;i++)
        {
            System.out.print(i+" ");
        }
        int x=0;
        while (x < 10) {
            System.out.print(x+" ");
            x++;
        }
        int y=20;
        do {
            System.out.print(y+"");
            y--;
        }while (y<15);
    }
}
