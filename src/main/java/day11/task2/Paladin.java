package main.java.day11.task2;

import main.java.day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements Healer {
    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (this.health < MIN_HEALTH || this.health == MAX_HEALTH) {
            return;
        } else this.health += 25;

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 10 > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else hero.health += 10;
    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}

