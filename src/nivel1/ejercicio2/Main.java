package nivel1.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Versa",5);
        //potencia can be different for each object but cannot be changed after constructor
        Coche coche2=  new Coche("March",3);
        Coche coche3=  new Coche("Frontier",2);

        //frenar es un metodo estatico por lo que puedo llamarlo desde la clase nivel1.ejercicio2.Coche directamente.
       Coche.frenar();
       //acelerar es un metodo no estatico debo llamarlo desde cada instancia de la clase nivel1.ejercicio2.Coche.
       coche2.acelerar();
       System.out.println(coche1.toString());
        System.out.println( coche2.toString());
        System.out.println(coche3.toString());

//EJEMPLOS DE QUE EL MODELO ES ESTATICO AL IMPRIMIR POR CONSOLA. INCLUSO CUANDO INSTANCIO UN NUEVO OBJETO DE LA CLASE Y CAMBIO EL MODELO, ME VA A TOMAR EL ULTIMO MODELO PARA TODOS LOS COCHES, EN ESTE CASO FRONTIER.
      /*  el vehiculo está frenando
        el vehiculo está acelerando
        nivel1.ejercicio2.Coche{model=Frontierpotencia=5}
        nivel1.ejercicio2.Coche{model=Frontierpotencia=3}
        nivel1.ejercicio2.Coche{model=Frontierpotencia=2}*/
    }
}