public class Main {
    public static void main(String[] args) {

        double variableOne = 20.00d;
        double variableTwo = 80.00d;

        double valuesTotal = 100.00d * (variableOne+variableTwo);
        System.out.println(" Total is " + valuesTotal);
        double theRemainder = valuesTotal % 40.00;
        System.out.println("The remainder="+ theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder ="+isNoRemainder);
        if (!isNoRemainder){
            System.out.println("got some remainder");
        }


    }
}