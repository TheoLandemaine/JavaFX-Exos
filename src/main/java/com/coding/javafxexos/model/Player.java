package com.coding.javafxexos.model;

public class Player {

    //Set variables
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public Player() {
        this.damage = 20;
        this.life = 200;
        this.shield = 10;
        this.spell = 15;
    }

    public void doDamages(Player a){
        //Set attack's damage
        a.life = a.life - damage;
    }

    public void Shield(){
        //Set attack's damage
        life = life + shield;
    }

    public void doDamagesMagic(Player a){
        //Set attack's damage
        a.life = a.life - (damage + spell);
        spell = spell / 2;
    }

}
