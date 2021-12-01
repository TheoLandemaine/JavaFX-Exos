package com.coding.javafxexos.model;

 public class Guerrier extends Player{

    private int shield = 15;

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void takeDamages(Player a){
        //Set attack's damage
        life = life - a.damage + shield;
    }

     public String toString() {
         return "Guerrier{" +
                 "shield=" + shield +
                 ", damage=" + damage +
                 ", life=" + life +
                 '}';
     }
 }
