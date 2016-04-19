package com.example.shorj_000.catinhat;

/**
 * Created by shorj_000 on 3/3/2016.
 */
public class CatInHat {
    CatsHat myHat;
    Grinch grinch;
    GreenEggsAndHam plate;
    Horton horton;
    Horton horton2;

    public CatInHat() {
        this.tipHat();
        this.welcomeFriends();
        this.standTall();
    }

    public void tipHat() {
        this.myHat = new CatsHat();
    }

    public void welcomeFriends() {
        this.grinch = new Grinch();
        this.plate = new GreenEggsAndHam();
        this.horton = new Horton();
        this.horton2 = new Horton();
    }

    public void standTall() {
    }
}