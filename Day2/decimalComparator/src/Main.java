public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        areEqualByThreeDecimalPlaces(4.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){
        int value1Check = (int)(value1 * 1000);
        int value2Check = (int)(value2 * 1000);
        if(value1Check - value2Check == 0){

            return true;
        } else

            return false;
    }
}