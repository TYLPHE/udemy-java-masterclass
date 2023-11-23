package IfKeywordAndCodeBlocks;

public class MethodChallenge {
    public static void main(String[] args) {

        int playerScore = 1500;
        String playerName = "Adam";

        displayHighScorePosition(playerName, calculatehighScorePosition(playerScore));

        playerScore = 1000;
        playerName = "Billy";

        displayHighScorePosition(playerName, calculatehighScorePosition(playerScore));

        playerScore = 500;
        playerName = "Cathy";

        displayHighScorePosition(playerName, calculatehighScorePosition(playerScore));

        playerScore = 100;
        playerName = "Donna";

        displayHighScorePosition(playerName, calculatehighScorePosition(playerScore));

        playerScore = 25;
        playerName = "Emma";

        displayHighScorePosition(playerName, calculatehighScorePosition(playerScore));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        
        System.out.println(playerName + " managed to get into position " + 
            playerPosition + " on the high score list");
    }

    public static int calculatehighScorePosition(int playerScore) {
        
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        
        return position;
    }
}
