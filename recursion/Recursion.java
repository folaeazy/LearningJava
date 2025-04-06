package recursion;

public class Recursion {

    public static void main(String[] args) {

       System.out.println( fibo(7));

    }

    static void print(int n) {
        if(n == 0) {
            return  ;
        }
        System.out.println(n);
        print(n - 1);
    }

    static int fibo(int n) {
        if(n < 2) {
            return n ;
        }

        return fibo(n -1)  + fibo(n - 2);
    }

}
