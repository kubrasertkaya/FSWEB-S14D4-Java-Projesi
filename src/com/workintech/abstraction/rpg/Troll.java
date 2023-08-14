package com.workintech.abstraction.rpg;

public class Troll extends Monster{

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage()+ bleed()+poison();
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return 0;
    }
}
