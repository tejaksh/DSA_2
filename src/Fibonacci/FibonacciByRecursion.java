package Fibonacci;

public class FibonacciByRecursion {
    static int count = 2;

    public static void fibonacci(int prev1,int prev2){
        if(count <=10){
            int newFib = prev1 + prev2;
            System.out.print(newFib + " ");
            prev2 = prev1;
            prev1 = newFib;
            count += 1;
            fibonacci(prev1, prev2);

        }
        else{
            return;
        }
    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fibonacci(1,0); //pass prev1 = 1 & prev2 = 0
    }
}
