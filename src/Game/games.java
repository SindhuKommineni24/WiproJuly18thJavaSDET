package Game;

public class games {
    // Default variables
    String gameName = "Chess";
    int gameId = 101;
    String gameType = "Board";

    // Default method
    void showGameDetails() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Game ID: " + gameId);
        System.out.println("Game Type: " + gameType);
    }

    
    public static void main(String[] args) {
        games game = new games();
        game.showGameDetails();  
    }
}
