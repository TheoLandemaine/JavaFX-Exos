package com.coding.javafxexos.model;

class Player1 {

    //Set variables
    String name;
    int damage;
    int life;
    int shield;
    int spell;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Player1() {
        this.name = name;
        this.damage = damage;
        this.life = life;
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points and he has " + life + " life's points";
    }
}
