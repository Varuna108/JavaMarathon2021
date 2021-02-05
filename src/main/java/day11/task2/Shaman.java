package main.java.day11.task2;

import main.java.day11.task2.Interfaces.Healer;
import main.java.day11.task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements MagicAttack, Healer {

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = (magicAtt - (magicAtt * hero.magicDef));

        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else hero.health -= attackScore;
    }

    @Override
    public void healHimself() {
        if (this.health < MIN_HEALTH || this.health == MAX_HEALTH) {
            return;
        } else this.health += 50;

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else hero.health += 30;

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}

