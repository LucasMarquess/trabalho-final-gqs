package model.impostos;

public class Icms extends Imposto {

    private static Icms instance;

    public Icms() {
        this.setNome("ICMS");
        this.setPercentual(0.07);
    }

    public static Icms getInstance() {
        if (instance == null) {
            instance = new Icms();
        }
        return instance;
    }
}
