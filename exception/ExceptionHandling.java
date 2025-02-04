package exception;

public class ExceptionHandling {

    int num = 10;

    public int divisor(int div) {
        int result = 0;
        try {
            System.out.println("Incoming.....from divisor");
            result = num / div;
        } catch (Exception e) {
            System.out.println("exception from catch" + e);
        } finally {
            System.out.println("Here is finally block executing");
        }
        return result;
    }

    public double divisor(double div) throws ArithmeticException // exception are meant to be handled from the caller
    {
        return num / div;
    }
}
