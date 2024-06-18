package pj.pjatk.kawaimpl;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CoffeeService extends DrinkService {
    public CoffeeService(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected Set<String> setPossibleAdditions() {
        return new HashSet<>() {{
            add("MLEKO");
            add("CZEKOLADA");
            add("CUKIER");
        }};
    }
}
