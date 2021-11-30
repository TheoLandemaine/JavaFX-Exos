package com.coding.javafxexos.model;

class Sorcier extends Personnage{

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public void takeDamages(Personnage a){
        //Set attack's damage
        life = life - a.damage - spell;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage and has " + spell + " Spell's damage");
        spell = spell / 2;
    }

    //Set controller
    public Sorcier() {
        this.type = "Sorcier";
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Wizard";
    }
}
