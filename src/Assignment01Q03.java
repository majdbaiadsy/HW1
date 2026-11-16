public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // TODO: Replace this code with the correct Fibonacci sequence
        ////////////////////////////////////////////////////////////////
        /// ...
        
        int numOdd = 2;
        int[] fib = new int[x];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < x; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (fib[i] % 2 != 0) {
                numOdd++;
                
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.print(fib[i]);
            if (i < x - 1)
                System.out.print(" ");
        }
        System.out.println();
        ///////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
