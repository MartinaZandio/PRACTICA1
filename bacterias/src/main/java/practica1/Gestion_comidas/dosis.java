package practica1.Gestion_comidas;
import java.io.Serializable;

public class dosis implements Serializable{
    
    private int cantidadinicial; //cantidad del primer dia 
    private int cantidadmaxincremento;  //cantidad de comida en el ultimo dia de incremento de dosis 
    private int cantidadfinal;   //cantidad que ha sido repartida al final 
    private int ultimodiaincremento;  //ultimo dia en el q la dosis de comida aumenta linealmente 

    public dosis(int cantidadinicial, int cantidadmaxincremento, int cantidadfinal, int ultimodiaincremento) {
        this.cantidadinicial = cantidadinicial;
        this.cantidadmaxincremento = cantidadmaxincremento;
        this.cantidadfinal = cantidadfinal;
        this.ultimodiaincremento = ultimodiaincremento; 
    }

    public dosis(){
        this.cantidadinicial = 0;
        this.cantidadmaxincremento = 0;
        this.cantidadfinal = 0;
        this.ultimodiaincremento = 0;
    }

    public int getCantidadInicial() {  return cantidadinicial; }

    public void setCantidadInicial(int cantidadinicial) { this.cantidadinicial = cantidadinicial; }

    public int getUltimoDiaIncremento() {  return ultimodiaincremento;  }

    public void setUltimoDiaIncremento(int ultimodiaincremento) {  this.ultimodiaincremento = ultimodiaincremento; }

    public int getCantidadMaxIncremento() {  return cantidadmaxincremento;  }

    public void setCantidadMaxIncremento(int cantidadmaxincremento) {  this.cantidadmaxincremento = cantidadmaxincremento; }

    public int getCantidadFinal() {  return cantidadfinal;   }

    public void setCantidadFinal(int cantidadfinal) {  this.cantidadfinal = cantidadfinal;  }

    @Override
    public String toString() {
        return "\nDOSIS DE COMIDA" +
                "\nLa cantidad inicial de comida es: " + cantidadinicial +
                "\nEl ultimo dia en el que la dosis crece linealmente, la dosis es de: " + cantidadmaxincremento +
                "\nLa cantidad final de comida es: " + cantidadfinal +
                "\nEl ultimo dia en el que la dosis crece linealmente es: " + ultimodiaincremento + "\n";
    }

    public static int reparticion(int cantidadinicial, int cantidadmaxincremento, int cantidadfinal, int ultimodiaincremento){
        int cantidad = 0; 
            for (int i=0; i<=30; i++){
            if (i<=ultimodiaincremento){
                cantidad = cantidadinicial + (cantidadmaxincremento - cantidadinicial) * i / ultimodiaincremento;
            }
            else{
                cantidad = cantidadmaxincremento - (cantidadmaxincremento - cantidadfinal) * (i - ultimodiaincremento) / (30 - ultimodiaincremento);
            }
            System.out.println("Dia " + i + ": " + cantidad + " gramos de comida");
        }

        return cantidad;

    }

}

    





