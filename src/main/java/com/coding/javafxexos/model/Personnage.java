package com.coding.javafxexos.model;

import java.util.Scanner;

class Personnage {

    //Set variables
    String name;
    int damage;
    int life;
    int initiative;
    String type;
    int shield;
    int spell;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //Set character to choice in the display
    void displayCharacter(String nameD, int damageD, int lifeD, int initiativeD, String typeD) {

        System.out.println("You are " + nameD + ", he inflict " + damageD
                + " damage's points, he has " + lifeD + " life's points, he has " + initiativeD +
                " initiative's points and you are a " + typeD);
    }

    //Set controller
    public Personnage() {
        this.name = name;
        this.damage = damage;
        this.life = life;
        this.initiative = initiative;
        this.type = type;
    }

    void characteristics() {

        //Set name
        System.out.println("Enter your name : ");
        Scanner nom = new Scanner(System.in);
        name = nom.nextLine();

        //Set damage's points
        System.out.println("Enter your damage's points : ");
        Scanner Damage = new Scanner(System.in);
        damage = Damage.nextInt();

        //Set life's points
        System.out.println("Enter your life's points : ");
        Scanner vie = new Scanner(System.in);
        life = vie.nextInt();

        //Set initiative's points
        System.out.println("Enter your initiative's points : ");
        Scanner initiatives = new Scanner(System.in);
        initiative = initiatives.nextInt();
    }

    public String toString() {
        return "You are " + name + ", he inflict " + damage
                + " damage's points, he has " + life + " life's points, he has " + initiative +
                " initiative's points";
    }

    public void warriorCapacity() {
        //Set shield's value
        System.out.println("Enter your shield's points : ");
        Scanner Shield = new Scanner(System.in);
        shield = Shield.nextInt();
    }

    public void wizardCapacity() {
        //Set spell's value
        System.out.println("Enter your spell's points : ");
        Scanner Spell = new Scanner(System.in);
        spell = Spell.nextInt();
    }

    public void takeDamages(Personnage a){
        //Set attack's damage
        life = life - a.damage;
        System.out.println(name + " has " + life + " pv and received " + a.damage + " damage");

    }

}
