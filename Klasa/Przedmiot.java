package org.example;

public class Przedmiot {
    private String nazwa;
    private Sala sala;
    public Przedmiot(String nazwa, Sala sala)
    {
        this.nazwa = nazwa;
        this.sala = sala;
    }
    public void setNazwa (String nazwa)
    {
        this.nazwa = nazwa;
    }
    public String getNazwa()
    {
        return nazwa;
    }
    public void setSala (Sala sala)
    {
        this.sala = sala;
    }
    public Sala getSala()
    {
        return sala;
    }

}
