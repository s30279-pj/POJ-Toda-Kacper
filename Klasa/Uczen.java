package org.example;

public class Uczen {
    private String imie;
    private String nazwisko;
    private int nrstudenta;
    private Grupa[] grupy;

    public Uczen(String imie, String nazwisko, int nrstudenta, Grupa[] grupy)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrstudenta = nrstudenta;
        this.grupy = grupy;
    }
    public void setImie (String imie)
    {
        this.imie = imie;
    }
    public String getImie()
    {
        return imie;
    }
    public void setNazwisko (String nazwisko)
    {
        this.nazwisko = nazwisko;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public void setNrstudenta (int nrstudenta)
    {
        this.nrstudenta = nrstudenta;
    }
    public int getNrstudenta()
    {
        return nrstudenta;
    }
    public void setGrupy (Grupa[] grupy)
    {
        this.grupy = grupy;
    }
    public Grupa[] getGrupy()
    {
        return grupy;
    }

    // Pyt. 1 Problemem może być powtarzalność danych oraz trudność w zarządzaniu nimi //
}
