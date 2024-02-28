package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int prev2 = 0; //prev2 = 0 because 0 comes before 1
        int prev1 = 1;
        //int prev3 = -1
        //int prev4 = -2

        System.out.println(prev2 + " " + prev1);

        // By using for-loop
        for(int fib = 0; fib < 18 ; fib++){ //excute loop till 18
            int newFib = prev1 + prev2; //new number will be sum of previous 2 numbers
            System.out.print(newFib + " ");

            prev2 = prev1;
            prev1 = newFib;
        }
    }
}
