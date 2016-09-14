package helpers;

/**
 * TODO: add description
 *
 * @author Krzysztof Chmielewski
 */
public class Zdzicho {
    private final int wzrost;
    private final boolean zona;

    private Zdzicho(int wzrost, boolean zona) {
        this.wzrost = wzrost;
        this.zona = zona;
    }

    public static Zdzicho singiel(int wzrost) {
        return new Zdzicho(wzrost, false);
    }

    public static Zdzicho zonaty(int wzrost) {
        return new Zdzicho(wzrost, true);
    }
}
