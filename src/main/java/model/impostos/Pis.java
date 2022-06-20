package model.impostos;

public class Pis extends Imposto{
    private static Pis instance;

    public Pis() {
        this.setNome("PIS");
        this.setPercentual(0.0065);
    }

    public static Pis getInstance() {
        if (instance == null) {
            instance = new Pis();
        }
        return instance;
    }
}
