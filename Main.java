// My first java code written 02-01-2025;

import math.MethodOverloading;

public class Main

{
    //static final int age; /// final keyword serves as constant in java
    static int age;

     static int variables(){
        age = 10;
        String name = "Raymond";
        System.out.println("Printing out " + name  + " age ......." + age);
        return age;
    }
    
   
    public static void main(String[] args)
    {
        //variables(); //only static method can be called this way without the instance of a class.
        //Hello obj = new Hello();
        
        System.out.println("Hello from java");
        
       // LocalVariable obj = new LocalVariable();
        byte a = 5 , b = 4;
       //int result = obj.test(a,b);
        MethodOverloading obj = new MethodOverloading();
        //int result = obj.sum(2,5);
        //double result = obj.sum(2.0,5.0);
        String result = obj.sum("John", "Raymond");
        System.out.println("Printing out result ......." + result);
        // inheritance with method overloading
        System.out.println(obj.division(10,2));
        

        
    }
}



