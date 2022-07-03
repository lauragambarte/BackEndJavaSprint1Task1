package nivel1.ejercicio1;

public class InstrumentoCuerda extends Instrumento{
public InstrumentoCuerda(String name, int price) {
            super(name, price);

        }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de cuerda");
    }

}
