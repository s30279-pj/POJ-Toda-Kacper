package org.example;

import javax.swing.text.rtf.RTFEditorKit;

public class Samochod {
    Model model;
    Silnik silnik;
    Karoseria karoseria;
    Kola kola;
    public Samochod(String model, String model_silnika, double pojemnosc_silnika, String kolor, int vmax)
    {
        this.model = new Model(model);
        this.silnik = new Silnik(model_silnika, pojemnosc_silnika);
        if (kolor.compareTo("RED") == 0) {this.karoseria = Karoseria.RED;}
        if (kolor.compareTo("WHITE") == 0) {this.karoseria = Karoseria.WHITE;}
        if (kolor.compareTo("BLACK") == 0) {this.karoseria = Karoseria.BLACK;}
        this.kola = new Kola(vmax);
    }

}
