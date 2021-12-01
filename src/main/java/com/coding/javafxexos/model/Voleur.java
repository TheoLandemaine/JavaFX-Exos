package com.coding.javafxexos.model;

public class Voleur extends Player{

    private int defaultAttack;
    protected int dodge;
    protected int critical;

    public void setAttack(int attaque) {
        this.damage = attaque;
        this.defaultAttack = attaque;
    }

    public void damage(double damage) {
        int Luck = (int) (Math.random() * 101);
        if (Luck >= 50) {
            life -= 0;
            System.out.println("DODGED");
        } else {
            life -= damage;
        }
    }

    public void CriticalHit() {
        int Crits = (int) Math.round(Math.random() * 1); // Pick a random number between 0 and 1
        if (Crits == 0 && this.damage != this.defaultAttack*2) { // If random number == 0 && lastAttack is not a critical
            this.damage = this.defaultAttack*2;
            System.out.println("OMG CRIT ⚡️");
        } else {
            this.damage = this.defaultAttack;
        }
    }

//    public void giveDodge() {
//        setShield(Main.ScannerInt());
//    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int wif) {
        this.dodge = wif;
    }

//    public void giveCriticalHit() {
//        setShield(20);
//    }

    public int getCriticalHit() {
        return critical;
    }

    public void setCriticalHit(int strike) {
        this.critical = strike;
    }

}

//    public void takeDamages(Player a){
//        thiefDamage(a.damage);
//        CriticDamage(a.damage);
//    }
//
//    public boolean getDodge() {
//        //Creation of a number between 0 and 1
//        double value = Math.random();
//
//        if (value >= 0.5) {
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    public void thiefDamage(int damage) {
//        if (getDodge() == true) {
//            life -= 0;
//        }else {
//            life -= damage;
//        }
//    }
//
//    public void CriticDamage(int damage) {
//        //Player critical attack
//        double val2 = Math.random();
//        if(val2>=0.5){
//            life = life - damage ;
//        }
//    }