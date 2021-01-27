package main.java.day7;

public class Task2 {
    public static void main(String[] args) {

        final Player[] player = new Player[6];
        for (int i = 0; i < 6; i++) {
            player[i] = new Player(Player.Random.generate(90, 100));     // инициализация объектов Player
        }

        Player.info();

        int result = player[0].getStamina();
        for (int i = 0; i < result + 1; i++) {
            player[0].run();
        }

        Player.printCountPlayers();



    }
}
