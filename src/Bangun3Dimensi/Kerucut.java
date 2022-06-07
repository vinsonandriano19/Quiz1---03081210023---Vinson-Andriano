package Bangun3Dimensi;

import java.util.Scanner;

public class Kerucut {
    public double jari;
    public double tinggi;
    public double pelukis;
    final double pi = (22.0/7);
    double volume;
    Scanner data = new Scanner(System.in);

    public void inputData ()
    {
        System.out.print ("Input Tinggi = ");
        tinggi = data.nextDouble();
        System.out.print ("Input Jari = ");
        jari = data.nextDouble();
    }

    public double hitungVolumeKerucut ()
    {
        return 1.0/3 * pi * Math.pow(jari, 2) * tinggi;
    }

    public double hitungLuasKerucut ()
    {
        pelukis = Math.sqrt(Math.pow(tinggi, 2)+Math.pow(jari, 2));
        return pi * jari * (pelukis + jari);
    }
    
    public void tampilLuasKerucut ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Jari = " + jari + "cm");
        System.out.println ("Tinggi = " + tinggi + "cm");
        System.out.println ("Pelukis = " + pelukis + "cm");
        System.out.println ("================================");
        System.out.println ("Luas = " + hitungLuasKerucut() + "cm2");
    }

    public void tampilVolumeKerucut ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Jari = " + jari + "cm");
        System.out.println ("Tinggi = " + tinggi + "cm");
        System.out.println ("================================");
        System.out.println ("Volume = " + hitungVolumeKerucut () + "cm3");
    }
}
