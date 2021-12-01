package com.coding.javafxexos.model;

public class Sorcier extends Player{

    int spell = 20;

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public void takeDamages(Player a){
        //Set attack's damage
        life = life - a.damage - spell;
        spell = spell / 2;
    }

    public String toString() {
        return "Sorcier{" +
                "damage=" + damage +
                ", life=" + life +
                ", spell=" + spell +
                '}';
    }
}
