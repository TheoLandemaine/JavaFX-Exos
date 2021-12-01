package com.coding.javafxexos.model;

public class Sorcier extends Player{

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

//    public void doDamagesMagic(Player a){
//        //Set attack's damage
//        a.life = a.life - damage - spell;
//        spell = spell / 2;
//    }

}
