package com.coding.javafxexos.model;

class Guerrier1 extends Player1{

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void takeDamages(Player1 a){
        //Set attack's damage
        life = life - a.damage + shield;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage and " + shield + " shield's protection");
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points and he is a Warrior";
    }
}
