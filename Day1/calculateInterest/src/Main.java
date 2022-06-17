public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        //for(init; termination; increment)
        for (int i=0; i<5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        for (int interestRate =2; interestRate<9; interestRate++){
            System.out.println("10,000 at " + interestRate+" interest = " + String.format("%.2f",calculateInterest(10000.0, interestRate)));

        }

        for (int interestRate =8; interestRate>1; interestRate--){
            System.out.println("10,000 at " + interestRate+" % interest = " + String.format("%.2f",calculateInterest(10000.0, interestRate)));

        }

        int count = 0;
        for (int i=10; i<50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number" + i + " is a prime number");
                if (count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i=2; i<= n/2; i++){
            if(n %i == 0){
                return false;
            }
        }
        return true;
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }
}