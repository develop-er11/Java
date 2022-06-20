public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was" + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        //part of methods challenge
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was" + highScore);

        int playerPosition  = calculateHIghScorePosition(1500);
        displayHighScorePosition("Rutu", playerPosition);

        playerPosition = calculateHIghScorePosition(900);
        displayHighScorePosition("Ruu", playerPosition );

        playerPosition = calculateHIghScorePosition(400);
        displayHighScorePosition("Varad", playerPosition );

        playerPosition = calculateHIghScorePosition(50);
        displayHighScorePosition("Duf", playerPosition );
        //part of methods challenge end
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }

        return -1;

    }


// methods Challenge
        public static void displayHighScorePosition( String playerName, int playerPosition){
            //playerName = "Rutu";
            System.out.println(playerName+" Managed to get the position " + playerPosition+" on the high score table");
            //playerPosition = 1;
            //System.out.println(playerPosition+" on the high score table");
        }

        public static int calculateHIghScorePosition(int score){

            //if(score >= 1000){
               // return 1;
            //} else if (score>=500) {
               // return 2;
            //} else if (score>=100) {
               // return 3;
            //} else {
              //  return 4;
          //  }
        int position =4;
        if (score >= 1000){
            position =1;
        } else if (score >=500){
            position =2;
        } else if (score >=100) {
            position=3;
        }
        return position;
        }
}
