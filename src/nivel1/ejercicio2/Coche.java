package nivel1.ejercicio2;/*Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca ha de ser estàtic final, el model estàtic i la potència final. Demostra la diferència entre els tres. N’hi ha algun que es pugui inicialitzar al constructor de la classe?

        Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar() i un altre no estàtic anomenat accelerar(). El mètode accelerar ha de mostrar per consola: “El vehicle està accelerant” i el mètode frenar() ha de mostrar: “El vehicle està frenant”.

        Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.*/





public class Coche {
    private static final String MARCA = "Nissan";
    //for all the cars will the the same and i cannot never change it. UPPER CASE.

    private static String model;
    //Its the same for all cars but can be changed since its not final, it can be changed in another instance of an object, or in a setter.
    //CAN have setter, i can use coche.model, instead of this.model
    private final int potencia;
    //unique for each car but can not be changed after the constructor. If i create another instance of the  class I can change the potencia
    //NO SETTERS.

    public Coche(String model, int potencia) {

        Coche.model = model;
        this.potencia = potencia;


    }

    public static String getModel() {
        return model;
    }

    public int getPotencia() {
        return potencia;
    }

    public static void setModel(String model) {
        Coche.model = model;
    }

    //CANNOT MODIFY POTENCIA WITH A SETTER BECAUSE ITS FINAL
   /*public  void setPotencia(int potencia) {
        this.potencia = potencia;
    }*/

    public static void frenar() {
        System.out.println("el vehiculo está frenando");
    }

    public void acelerar() {
        System.out.println("el vehiculo está acelerando");
    }

    @Override
    public String toString() {
        return "nivel1.ejercicio2.Coche{" + "model="+model+
                "potencia=" + potencia +
                '}';
    }
}

