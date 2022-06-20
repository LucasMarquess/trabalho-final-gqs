package model.descontos;

public class Cupom10 extends Desconto {

    private static Cupom10 instance;

    public Cupom10() {
        this.setTipo("Cupom 10%");
        this.setPercentual(0.1);
    }

    public static Cupom10 getInstance() {
        if (instance == null) {
            instance = new Cupom10();
        }
        return instance;
    }
}
