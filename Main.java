// My first java code written 02-01-2025;

import math.MethodOverloading;
import abstracts.Brand;
import interfaces.Drive;
import interfaces.DriveACar;

public class Main

{
    //static final int age; /// final keyword serves as constant in java
    int age;

    static void display(Integer x) 
    {
        System.out.println("first interger......." + x );
    }
    
    static void display(int x) 
    {
        System.out.println("second int......." + x );
    }
   
    
   
    public static void main(String[] args)
    {
        //variables(); //only static method can be called this way without the instance of a class.
        //Hello obj = new Hello();
        
        System.out.println("Hello from java");
        
       // LocalVariable obj = new LocalVariable();
        byte a = 5 , b = 4;
       ////int result = obj.test(a,b);
        //MethodOverloading obj = new MethodOverloading();
        //int result = obj.sum(2,5);
        //double result = obj.sum(2.0,5.0);
        //String result = obj.sum("John", "Raymond");
        //System.out.println("Printing out result ......." + result);
        // inheritance with method overloading
        //System.out.println(obj.division(10,2));

        //StringsDemo obj = new StringsDemo();
        //System.out.println("anonymous object creating...."+ obj.num);

        //practising abstract class

        // Brand car = new Brand();
        // car.startEngine();
        // car.electric();


        //practicing interface

       // Drive car =  new DriveACar();
        //car.stop();

    // Child children = new Child();
    // children.variables();


    display(10);


    

        
    }
}



class Parent 
{
    static int variables()
    {
        int age = 10;
        String name = "Raymond";
        System.out.println("Printing out " + name  + " age ......." + age);
        return age;
    }
    
}


class Child extends Parent
{
    static int variables()
    {
        System.out.println("Incoming from  Practis.....");
        return 0;
    }
}