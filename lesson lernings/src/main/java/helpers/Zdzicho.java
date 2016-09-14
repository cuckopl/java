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

    public class Builder {
        private int wzrost;
        private boolean zona;

        public Builder wzrost(int wzrost) {
            this.wzrost = wzrost;
            return this;
        }

        public Builder zona(boolean zona) {
            this.zona = zona;
            return this;
        }

        public Zdzicho build() {
            return new Zdzicho(wzrost, zona);
        }
    }
}
