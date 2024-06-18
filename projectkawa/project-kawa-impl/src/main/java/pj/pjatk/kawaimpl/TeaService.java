package pj.pjatk.kawaimpl;

import pl.pjatk.kawa.ReduceInterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TeaService extends DrinkService implements ReduceInterface {

    private String discountCode;

    public TeaService(Scanner scanner) {
        super(scanner);
        discountCode = null;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    @Override
    protected Set<String> setPossibleAdditions() {
        return new HashSet<>() {{
            add("MIOD");
            add("SLODZIK");
            add("CUKIER");
        }};
    }

    @Override
    public double calculatePrice() {
        double normalPrice = super.calculatePrice();
        return discountCode == null
                ? normalPrice
                : normalPrice - normalPrice * (applyDiscount(discountCode) / 100.0);
    }

    @Override
    public double applyDiscount(String code) {
        return switch(code) {
            case "JESIENIARA" -> 5.0;
            case "DOKTORAT" -> 7.0;
            default -> throw new IllegalStateException("Kod ulegl przedawnieniu.");
        };
    }
}
