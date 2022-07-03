package nivel1.ejercicio1;
//abstract class allows me to have attributes while interfaces dont.

abstract class Instrumento {
    static int counter=0;
    private String name;
    private int price;
//BLOQUE DE INICIALIZACION POR CADA VEZ QUE SE CREE  UN INSTRUMENTO
    {counter++;
        System.out.println("Bloque de inicializacion "+counter);}
    //inicializacion del objeto, trabaja de forma similar al constructor

    //BLOQUE ESTATICO, SE CARGA UNA UNICA VEZ Y AL PRINCIPIO.
static{System.out.println("Bloque estático");}
    public Instrumento(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public abstract void tocar();
    //abstract doesn't need a body. inside{} is the body.
}