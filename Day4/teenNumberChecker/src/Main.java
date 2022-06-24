public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
        return  isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge) ;

        }
    public static boolean isTeen(int firstAge){
        return (firstAge >= 13 && firstAge <= 19);
    }
}