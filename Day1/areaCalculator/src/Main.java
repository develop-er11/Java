public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
    public static double area (double radius) {
        //return (radius < 0) ? -1 : radius * radius * Math.PI;
        if (radius<0){
            return -1;
        }
        return radius*radius*Math.PI;
    }

    public static double area (double x, double y) {
       // return (x < 0 || y < 0) ? -1 : x * y;
        if (x < 0 || y < 0){
            return -1;
        }
        return x*y;
    }


}