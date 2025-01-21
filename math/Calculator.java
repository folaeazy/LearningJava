package math;
public class Calculator
{
    Calculator()
    {
        System.out.println(" Calculator class extending");
    }
    int product(int a, int b)
    {
        return a * b;
    }

    public int division(int a, int b)
    {
        return a / b;
    }

    double power(int a, int b)
    {
        return Math.pow(a,b);
    }


}