public class Main {
    public static void main(String[] args) {
        //operators

        int result = 1+2;
        System.out.println("1+2 =" + result);
        int previousResult = result;
        System.out.println("previousResult =" + previousResult);
        result = result -1;
        System.out.println("3-1 ="+ result);
        System.out.println("Result ="+ result);

        result = result * 10;
        System.out.println("2*10 ="+ result);

        result = result/5;
        System.out.println("20/5="+ result);
        System.out.println("Result ="+ result);

        result = result % 3;
        System.out.println("4 % 3="+ result);

        result++;
        System.out.println("1+1="+result);

        result--;
        System.out.println("2-1="+ result);

        result += 2;
        System.out.println("1+2="+result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("you got the high score!");
        }
        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90 || (secondTopScore <= 90))){
            System.out.println("Either or both of conditions are true");
        }

        int newValue = 50;
        if (newValue != 50){
            System.out.println("This wont print out using single = ");
        }
        boolean isCar = false;
        if (isCar = true){
            System.out.println("This is boolean values");
        }

        isCar = true;
        boolean wasCar = isCar ? true:false;
        if (wasCar){
            System.out.println("wasCar is true");
        }
    }
}