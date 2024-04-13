package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Przedmiot europa = new Przedmiot("Europa Universalis IV", Sala.KOMPUTEROWA);
        Grupa grupa_A = new Grupa("A",new Przedmiot[]{europa},new Uczen[]{} );
        Grupa grupa_B = new Grupa("B",new Przedmiot[]{europa},new Uczen[]{} );
        Uczen dawid = new Uczen("Dawid","Filip", 2137, new Grupa[]{grupa_B});
        Uczen kacper = new Uczen("Kacper","Kaca", 2115, new Grupa[]{grupa_B});
        Uczen michal = new Uczen("Michal","Czechowicz", 6666, new Grupa[]{grupa_A});
        Uczen kamil = new Uczen("Kamil","Klemiato", 6969, new Grupa[]{grupa_A});
        Uczen julia = new Uczen("Julia","Kowalska", 997, new Grupa[]{grupa_A,grupa_B});
         /*
         Metoda 1 System.out.println(grupa_A.getPrzedmiot()[0].equals(grupa_B.getPrzedmiot()[0]));

         Metoda 2 System.out.println(grupa_B.getPrzedmiot()[0].hashCode()==grupa_A.getPrzedmiot()[0].hashCode());

         Da sie to zweryfikować obiema metodami

         Kontrakt między Equals a Hashcode mówi, że jeśli dwa obiekty są równe (wg. metody Equals), to ich hashe muszą być również równe.
         Nie można jednak z tego samego powodu wnioskować odwrotnie - równe hashe nie gwarantują równości obiektów
         */
        /*Pyt 2
        W przypadku naszego zadania lepiej jest użyć enuma

        YAGNI (You Aren't Gonna Need It): Zasada ta mówi, że nie należy dodawać funkcjonalności, dopóki nie będą one rzeczywiście potrzebne.
        Jeśli enum wystarcza do prostego modelowania, to nie trzeba komplikować projektu dodając klasy abstrakcyjne.

        KISS (Keep It Simple, Stupid): Ta zasada mówi, że projekt powinien być jak najprostszy, o ile tylko możliwe.
        Jeśli enum spełnia wymagania i jest łatwy w zrozumieniu i obsłudze, to lepiej go użyć.
        */
        /*Zad Dod
         Dodatkowe zadanie, które wymaga umożliwienia wyciszania, włączania i wyłączania prądu w salach, nie wpływa znacząco na decyzję dotyczącą użycia klasy abstrakcyjnej lub enum.
         Ta funkcjonalność dotyczy raczej implementacji niż samego modelu danych, więc nie ma bezpośredniego wpływu na wybór struktury danych.
         Jednakże, należy zastanowić się nad sposobem implementacji tych dodatkowych metod w kontekście zasad KISS i YAGNI.
         Jeśli te metody są proste i nie wprowadzają zbyt dużego skomplikowania, to można je dodać bez problemu.
         Jeśli jednak wymagają one zbyt dużej ilości dodatkowego kodu, warto się zastanowić, czy są one rzeczywiście potrzebne zgodnie z zasadą YAGNI.
         */
    }
}