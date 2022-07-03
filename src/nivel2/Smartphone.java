package nivel2;

public class Smartphone extends Telefono implements Camara, Reloj{
    public Smartphone(String marca, String modelo){
        super(marca,modelo);
    }

    @Override
    public void fotografiar() {
        System.out.println("Se esta sacando una foto");

    }

    @Override
    public void alarma() {
        System.out.println("la alarma esta sonando");
    }
}
