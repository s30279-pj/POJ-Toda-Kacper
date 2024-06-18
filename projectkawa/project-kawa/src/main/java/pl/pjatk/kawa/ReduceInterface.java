package pl.pjatk.kawa;

public interface ReduceInterface {

    /**
        @param code - discount code
        Returns discount in percent
     */
    double applyDiscount(String code);
}
