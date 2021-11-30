package com.coding.javafxexos.model;

class Guerrier extends Personnage{

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void takeDamages(Personnage a){
        //Set attack's damage
        life = life - a.damage + shield;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage and " + shield + " shield's protection");
    }

    //Set controller
    public Guerrier() {
        this.type = "Guerrier";
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Warrior";
    }
}
