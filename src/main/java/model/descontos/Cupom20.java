package model.descontos;

public class Cupom20 extends Desconto{
    private static Cupom20 instance;

    public Cupom20() {
        this.setTipo("Cupom 20%");
        this.setPercentual(0.2);
    }

    public static Cupom20 getInstance() {
        if (instance == null) {
            instance = new Cupom20();
        }
        return instance;
    }
}
