package com.coding.javafxexos.model;

public class Player {

    //Set variables
    int damage;
    int life;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public Player() {
        this.damage = 20;
        this.life = 200;
    }

}
