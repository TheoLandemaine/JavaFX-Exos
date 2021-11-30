package com.coding.javafxexos.model;

class Voleur extends Personnage{

    public Voleur() {
        this.type = "Voleur";
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points and he is a Thief";
    }

    public void takeDamages(Personnage a){
        thiefDamage(a.damage);
        CriticDamage(a.damage);
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage" );

    }
    public boolean getDodge() {
        //Creation of a number between 0 and 1
        double value = Math.random();

        if (value >= 0.5) {
            return true;
        }else {
            return false;
        }
    }

    public void thiefDamage(int damage) {
        if (getDodge() == true) {
            life -= 0;
        }else {
            life -= damage;
        }
    }

    public void CriticDamage(int damage) {
        //Player critical attack
        double val2 = Math.random();
        if(val2>=0.5){
            life = life - damage ;
        }
    }
}
