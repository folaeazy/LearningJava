//method overloading in java
package math;
public class MethodOverloading extends Calculator
{
     public int sum(int a, int b)
     {
        return a + b;
     }

     double sum(double a , double b)
     {
        return a * b;
     }

     public String sum(String firstname, String lastname)
     {
        return firstname + " " + lastname;
     }
}




