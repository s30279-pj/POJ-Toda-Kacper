package pl.pjatk.kawa;

public interface DrinkInterface {

    void chooseSize();

    void chooseAdditions();

    double calculatePrice();

    default double order() {
        chooseSize();
        chooseAdditions();
        return calculatePrice();
    }
}
