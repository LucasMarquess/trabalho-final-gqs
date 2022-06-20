package model.impostos;

public class Iss extends Imposto{

    private static Iss instance;

    public Iss() {
        this.setNome("ISS");
        this.setPercentual(0.02);
    }

    public static Iss getInstance() {
        if (instance == null) {
            instance = new Iss();
        }
        return instance;
    }
}
