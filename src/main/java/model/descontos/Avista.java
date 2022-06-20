package model.descontos;

public class Avista extends Desconto{
    private static Avista instance;

    public Avista() {
        this.setTipo("A Vista");
        this.setPercentual(0.15);
    }

    public static Avista getInstance() {
        if (instance == null) {
            instance = new Avista();
        }
        return instance;
    }
}
