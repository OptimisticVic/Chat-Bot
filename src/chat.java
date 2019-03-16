public class chat {
    public static void main(String[] args) {
        game[] currentGame = new game[3];
        currentGame[0] = new game();
        currentGame[1] = new pubg();
        currentGame[2] = new fortnite();

        for (int i = 0; i < 3; i++) {
            System.out.println(currentGame[i].name);
        }
    }
}

class game {
    public String name = "game";
}

class pubg extends game {
    public String name = "PUBG";

}

class fortnite extends game {
    public String name = "Fortnite";
}