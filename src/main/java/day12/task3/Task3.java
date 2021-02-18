package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("mkdir", 2003);
        MusicBand musicBand2 = new MusicBand("mv", 2000);
        MusicBand musicBand3 = new MusicBand("cat", 2004);
        MusicBand musicBand4 = new MusicBand("grep", 1990);
        MusicBand musicBand5 = new MusicBand("vim", 2020);
        MusicBand musicBand6 = new MusicBand("nano", 1876);
        MusicBand musicBand7 = new MusicBand("Putty", 2008);
        MusicBand musicBand8 = new MusicBand("Git", 2001);
        MusicBand musicBand9 = new MusicBand("Chmod 777", 2007);
        MusicBand musicBand10 = new MusicBand("ls -l", 2005);

        List<MusicBand> listOfBands = new ArrayList<>();
        listOfBands.add(musicBand1);
        listOfBands.add(musicBand2);
        listOfBands.add(musicBand3);
        listOfBands.add(musicBand4);
        listOfBands.add(musicBand5);
        listOfBands.add(musicBand6);
        listOfBands.add(musicBand7);
        listOfBands.add(musicBand8);
        listOfBands.add(musicBand9);
        listOfBands.add(musicBand10);
        Collections.shuffle(listOfBands);

        System.out.println(groupsAfter2000(listOfBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> listOfBands) {
        List<MusicBand> listOfBandsAfter2000 = new ArrayList<>();
        for (MusicBand listOfBand : listOfBands) {
            if (listOfBand.getYear() > 2000) {
                listOfBandsAfter2000.add(listOfBand);
            }
        }
        //System.out.println(listOfBandsAfter2000);

        return listOfBandsAfter2000;
    }
}

//
//        Создать статический метод в классе Task3:
//        public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//        Этот метод принимает список групп в качестве аргумента и возвращает новый список,
//        состоящий из групп, основанных после 2000 года.
//        Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main()
//        на вашем списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).

