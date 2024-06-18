package pj.pjatk.kawaimpl;

import pj.pjatk.kawaimpl.DrinkService;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final CoffeeService coffeeService = new CoffeeService(scanner);

    private static final TeaService teaService = new TeaService(scanner);

    public static void main(String[] args) {
        System.out.println("Czego chcesz sie napic?");
        String drink = scanner.nextLine();

        if(drink.equalsIgnoreCase("TEA")) {
            System.out.println("Czy masz kod znizkowy? Jesli tak wpisz Y");
            if(scanner.nextLine().equalsIgnoreCase("Y")) {
                System.out.println("Wpisz kod:");
                teaService.setDiscountCode(scanner.nextLine());
            }
        }

        DrinkService drinkService = switch(drink.toUpperCase()) {
            case "COFFEE" -> coffeeService;
            case "TEA" -> teaService;
            default -> throw new IllegalStateException("Nie ma takiego napoju w ofercie");
        };

        double price = drinkService.order();
        drinkService.saveToFile("orders.txt");

        System.out.println("Cena: " + price);
    }

}
