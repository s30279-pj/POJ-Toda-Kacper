package pj.pjatk.kawaimpl;

import pl.pjatk.kawa.DrinkInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public abstract class DrinkService implements DrinkInterface {

    private String size;

    private List<String> additions;

    private final Set<String> possibleAdditions;

    private final Scanner scanner;

    private Set<String> possibleSizes = new HashSet<>() {{
        add("S");
        add("M");
        add("L");
    }};
    protected abstract Set<String> setPossibleAdditions();

    public DrinkService(Scanner scanner) {
        possibleAdditions = setPossibleAdditions();
        this.scanner = scanner;
    }

    @Override
    public void chooseSize() {
        System.out.println("Podaj wielkosc napoju:");
        for(String s : possibleSizes) {
            System.out.println("- " + s);
        }
        size = scanner.nextLine().toUpperCase();
        if(!possibleSizes.contains(size.toUpperCase())) {
            throw new IllegalStateException("Niepoprawny rozmiar napoju.");
        }
    }

    @Override
    public void chooseAdditions() {
        additions = new ArrayList<>();

        System.out.println("Podaj dodatki: ");
        for(String a : possibleAdditions) {
            System.out.println("- " + a);
        }
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            }
            String addition = input;
            if(!possibleAdditions.contains(addition.toUpperCase())) {
                throw new IllegalStateException("Nieznany dodatek.");
            }
            additions.add(addition);
        }
    }

    @Override
    public double calculatePrice() {
        return switch (size) {
            case "L" -> 12.99;
            case "M" -> 9.99;
            case "S" -> 6.99;
            default -> throw new IllegalStateException("Nieprawidlowy rozmiar.");
        };
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            StringBuilder line = new StringBuilder();
            line.append("Size: ").append(size).append(", ");
            line.append("Additions: ").append(String.join(", ", additions)).append(", ");
            line.append("Price: ").append(calculatePrice());
            writer.write(line.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
