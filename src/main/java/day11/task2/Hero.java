package main.java.day11.task2;

import main.java.day11.task2.Interfaces.PhysAttack;

public abstract class Hero implements PhysAttack{
    final int MIN_HEALTH = 0;
    final int MAX_HEALTH = 100;
    int health;
    int physAtt;
    int magicAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = (physAtt - (physAtt * hero.physDef));

        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else hero.health -= attackScore;
    }
}
