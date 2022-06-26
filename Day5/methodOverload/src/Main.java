public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(156);


    }

    public static double calcFeetAndInchesToCentimeters(double feetValue, double inchesValue) {
        if((feetValue <=0) || ((inchesValue <=0) || (inchesValue>=12))){
            System.out.println("Invalid");
            return -1;
        }
        double centimeterValues = (feetValue * 12)*2.54;
        centimeterValues+= inchesValue * 2.54;
        System.out.println(feetValue+ " feet," + inchesValue+ " inches = " + centimeterValues+" cm");
        return centimeterValues;

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches <= 0){
            return -1;
        }
        double feetInInches = inches/12;
        double remainingInches = inches%12;
        System.out.println(feetInInches + "is feet value for given inches value");
        return calcFeetAndInchesToCentimeters( feetInInches,  remainingInches);

    }

}

//some error in this file