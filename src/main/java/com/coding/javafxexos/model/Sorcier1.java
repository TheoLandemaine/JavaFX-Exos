package com.coding.javafxexos.model;

class Sorcier1 extends Player1{

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public void takeDamages(Player1 a){
        //Set attack's damage
        life = life - a.damage - spell;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage and has " + spell + " Spell's damage");
        spell = spell / 2;
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points and he is a Wizard";
    }
}
