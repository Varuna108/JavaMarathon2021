package main.java.day11.task2;

import main.java.day11.task2.Interfaces.MagicAttack;

public class Magican extends Hero implements MagicAttack {
    public Magican() {
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = (magicAtt - (magicAtt * hero.magicDef));

        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else hero.health -= attackScore;
    }

    @Override
    public String toString() {
        return "Magican{" +
                "health=" + health +
                '}';
    }
}
