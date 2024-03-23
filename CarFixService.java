package org.example;
import java.awt.event.KeyAdapter;
import java.util.Random;
public class CarFixService {
    public Random los = new Random();
    public Samochod fix(Samochod car, Awaria awaria)
    {
        if (awaria == Awaria.AWARIA_SILNIKA)
        {
            String model = car.silnik.model_silnika;
            double pojemnosc = car.silnik.pojemnosc_silnika;
            car.silnik = new Silnik(model+" Naprawiony ", pojemnosc + 0.2);
        }
        if (awaria == Awaria.AWARIA_KAROSERII)
        {
            Karoseria[] values = Karoseria.values();
            Karoseria kolor = values[los.nextInt(3)];
            car.karoseria = kolor;
        }
        if (awaria == Awaria.AWARIA_KOL)
        {
            int vmax = car.kola.vmax;
            car.kola = new Kola(vmax);
            car.kola.naprawiony = true;
        }
        return car;
    }
    public CarFixService()
    {

    }
}
