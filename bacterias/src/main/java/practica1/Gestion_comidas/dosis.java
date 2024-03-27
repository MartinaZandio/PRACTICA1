package practica1.Gestion_comidas;
import java.io.Serializable;

/**
 * Clase dosis
 *
 * Esta clase contiene los atributos y métodos necesarios para gestionar la dosis de comida que se le da a las bacterias en cada experimento.
 *
 * @author Martina Zandio Lizarraga
 * @version 1.0
 * @since 1.0
 * @see Serializable
 * @see java.io.Serializable
 * @see java.io
 * @see java.io.IOException
 */

public class dosis implements Serializable{
    
    private int cantidadinicial; //cantidad del primer dia 
    private int cantidadmaxincremento;  //cantidad de comida en el ultimo dia de incremento de dosis 
    private int cantidadfinal;   //cantidad que ha sido repartida al final 
    private int ultimodiaincremento;  //ultimo dia en el q la dosis de comida aumenta linealmente 

    /**
     * Constructor de la clase dosis
     *
     * Este constructor se encarga de crear una nueva dosis de comida con los datos que se le pasan como parámetros.
     *
     * @param cantidadinicial Cantidad de comida del primer día
     * @param cantidadmaxincremento Cantidad de comida en el último día de incremento de dosis, máxima cantidad de comida que se les da a las bacterias.
     * @param cantidadfinal Cantidad que se les da a las bacterias el último dia del experimento (día 30)
     * @param ultimodiaincremento Último día en el que la dosis de comida aumenta linealmente, este día es determinado por el usuario.
     */
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

    /**
     * Método toString
     *
     * Este método se encarga de devolver una cadena de texto con los datos de la dosis de comida.
     *
     * @return String Cadena de texto con los datos de la dosis de comida
     */
    @Override
    public String toString() {
        return "\nDOSIS DE COMIDA" +
                "\nLa cantidad inicial de comida es: " + cantidadinicial +
                "\nEl ultimo dia en el que la dosis crece linealmente, la dosis es de: " + cantidadmaxincremento +
                "\nLa cantidad final de comida es: " + cantidadfinal +
                "\nEl ultimo dia en el que la dosis crece linealmente es: " + ultimodiaincremento + "\n";
    }

    /**
     * Método reparticion
     *
     * Este método se encarga de calcular la cantidad de comida que se le da a las bacterias en cada día del experimento, teniendo en cuenta que tiene que ser una función de aumento lineal hasta el día en el que el usuario dice que el incremento debe parar.
     *
     * @param cantidadinicial Cantidad de comida del primer día
     * @param cantidadmaxincremento Cantidad de comida en el último día de incremento de dosis, máxima cantidad de comida que se les da a las bacterias.
     * @param cantidadfinal Cantidad que se les da a las bacterias el último dia del experimento (día 30)
     * @param ultimodiaincremento Último día en el que la dosis de comida aumenta linealmente, este día es determinado por el usuario.
     * @return cantidad Cantidad de comida que se le da a las bacterias en cada día
     */
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

    





