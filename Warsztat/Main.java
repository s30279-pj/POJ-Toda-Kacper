package org.example;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Samochod[] auta;
    public static CarFixService serwis = new CarFixService();
    public static void main(String[] args) {
        Samochod samochod = new Samochod("BMW", "V8", 1.3, "WHITE", 240);
        Samochod samochod1 = new Samochod("Ford", "V4", 1.2, "BLACK", 190);
        Samochod samochod2 = new Samochod("Porshe", "V8", 1.6, "RED", 220);
        Samochod[] auta = {samochod, samochod1, samochod2};
        SentToService_for(auta);
        SentToService_foreach(auta);
        SentToService_stream(auta);
    }
    public static void SentToService_for(Samochod[] auta){
        for (int i = 0; i<=2; i++)
        {
            auta[i] = serwis.fix(auta[i],Awaria.AWARIA_SILNIKA);
            System.out.println(auta[i].silnik.model_silnika + auta[i].silnik.pojemnosc_silnika);
        }

    }
    public static void SentToService_foreach(Samochod[] auta){
        for (Samochod auto : auta)
        {
            auto = serwis.fix(auto,Awaria.AWARIA_KOL);
            System.out.println(auto.kola.vmax +" "+ auto.kola.naprawiony);
        }

    }

    public static void SentToService_stream(Samochod[] auta) {
            Arrays.stream(auta)
                    .limit(3)
                    .map(samochod -> serwis.fix(samochod, Awaria.AWARIA_KAROSERII))
                    .forEach(samochod -> System.out.println(samochod.karoseria));
        }
    }



