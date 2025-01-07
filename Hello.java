// My first java code written 02-01-2025;



public class Hello

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
        

        
    }
}

class LocalVariable
{
    public int test(byte a, byte b){
        int result = a + b ;
        return result;
    }
}

//method overloading in java
class MethodOverloading 
{
     int sum(int a, int b)
     {
        return a + b;
     }

     double sum(double a , double b)
     {
        return a * b;
     }

     String sum(String firstname, String lastname)
     {
        return firstname + " " + lastname;
     }
}




