package nivel1.ejercicio1;

public class InstrumentoPercusion extends Instrumento{
    public InstrumentoPercusion(String name, int price) {
        super(name, price);

    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de percusión");
    }
}
