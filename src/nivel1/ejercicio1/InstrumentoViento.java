package nivel1.ejercicio1;

public class InstrumentoViento extends Instrumento {


    public InstrumentoViento(String name, int price) {
        super(name, price);

    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de viento");
    }
}