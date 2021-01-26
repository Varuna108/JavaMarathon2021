package main.java.day7;

public class Player {
    public int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
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

    public static void getCountPlayers() {
        System.out.println(countPlayers);
    }


    public void run() {
        if (stamina > 0) {
            stamina -= 1;
        } else if (stamina == 0) {
            System.out.println("Игроку нужен отдых. Игрок покидает поле.");
            countPlayers--;
        }
    }

    public static void info() {
        int freePlaces = 6 - countPlayers;
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + freePlaces + " свободных мест");
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
