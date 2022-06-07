package Bangun3Dimensi;

import java.util.Scanner;

public class Bola {
    public double jari = 0;
    public final double pi = 22.0/7;
    private double volume;
    private double luas;
    Scanner data = new Scanner(System.in);

    public Bola() {
        this.jari = 0;
    }

    public Bola(double jari) {
        this.jari = jari;
    }
    public double getJari() {
        return this.jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getLuas() {
        return this.luas;
    }
    

    public double hitungVolumeBola ()
    {
        volume = 4/3 * pi * Math.pow(jari,3);
        return volume;
    }

    public double hitungLuasBola ()
    {
        luas = 4 * pi * Math.pow(jari,2);
        return luas;
    }
    
    public void tampilLuasBola ()
    {
        System.out.println ("----------------------------------------------");
        System.out.println ("Jari = " + jari + " cm");
        System.out.println ("==============================================");
        System.out.println ("Luas = " + hitungLuasBola() + " cm2");
    }
    
    public void tampilVolumeBola ()
    {
        System.out.println ("\n==============================================");
        System.out.println ("Volume = " + hitungVolumeBola () + " cm3");
    }
}
