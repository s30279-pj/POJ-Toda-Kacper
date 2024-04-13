package org.example;

public class Grupa {
    private String nazwa;
    private Przedmiot[] przedmioty;
    private Uczen[] uczniowie;


    public Grupa (String nazwa, Przedmiot[] przedmioty, Uczen[] uczniowie)
    {
        this.nazwa = nazwa;
        this.przedmioty = przedmioty;
        this.uczniowie = uczniowie;
    }
    public void setNazwa (String nazwa)
    {
        this.nazwa = nazwa;
    }
    public String getNazwa()
    {
        return nazwa;
    }
    public void setPrzedmiot (Przedmiot[] przedmioty)
    {
        this.przedmioty = przedmioty;
    }
    public Przedmiot[] getPrzedmiot()
    {
        return przedmioty;
    }
    public void setUczen ( Uczen[] uczniowie)
    {
        this.uczniowie = uczniowie;
    }
    public  Uczen[] getUczen()
    {
        return uczniowie;
    }


}
