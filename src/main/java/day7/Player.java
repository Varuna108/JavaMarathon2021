package main.java.day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static void printCountPlayers() {
        System.out.println(countPlayers);
    }


    public void run() {
        if (stamina == 0) {
            return;
        }

        stamina--;

        if (stamina == 0) {
            System.out.println("Игроку нужен отдых. Игрок покидает поле.");
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест ");
        }
    }

    public static class Random {        // класс обеспечивающий рандомными числами в заданном диапазоне
        public static int generate(int min, int max) {
            return min + (int)(Math.random() * ((max - min) + 1));
        }
    }
}
