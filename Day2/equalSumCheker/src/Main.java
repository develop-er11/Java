public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        hasEqualSum(1,1,2);
    }
    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue){
        if (firstValue+secondValue == thirdValue){
            return true;
        }else return false;
    }
}