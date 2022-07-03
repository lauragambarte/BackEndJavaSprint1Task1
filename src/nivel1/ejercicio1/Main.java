package nivel1.ejercicio1;

public class Main {
    public static void main(String[] args) {
       InstrumentoViento instrumentoViento1=new InstrumentoViento("Clarinete", 2000);
       InstrumentoCuerda instrumentoCuerda1=new InstrumentoCuerda("Guitarra",1000);
       InstrumentoPercusion instrumentoPercusion1= new InstrumentoPercusion("Bateria",10000);
       instrumentoPercusion1.tocar();
       instrumentoCuerda1.tocar();
       instrumentoViento1.tocar();
    }
    //static contador
    //get contador
    //bloque de inicializacion
   // bloque estatico


}