package Fibonacci;

public class FibonacciByFormula {
    public static int Fib(int n){
        if(n <= 1) {
            return n;
        }
        else {

        return Fib(n-1) + Fib(n-2); //fibonacci formula F(n) = F(n-1) + F(n-2)
    }
}

public static void main(String[] args) {
    System.out.println(Fib(19));
}
}
