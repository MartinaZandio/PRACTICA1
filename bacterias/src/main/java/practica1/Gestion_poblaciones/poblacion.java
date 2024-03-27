package practica1.Gestion_poblaciones;
import practica1. Gestion_experimentos.*;
import practica1.Gestion_comidas.*;
import java.util.Date;
import java.io.Serializable;

/**
 * Clase poblacion
 *
 * Esta clase contiene los atributos y métodos necesarios para gestionar las poblaciones de bacterias que se utilizan en los experimentos.
 * Además, cada población de bacterias está asociada a un experimento.
 *
 * @author Martina Zandio Lizarraga
 * @version 1.0
 * @since 1.0
 * @see experimento
 * @see Serializable
 * @see java.io.Serializable
 * @see java.io
 * @see java.io.IOException
 */
public class poblacion extends experimento implements Serializable{
  
    private String nombrepoblacion;
    private int numinicialbacterias;
    private experimento experimento;


    /**
     * Constructor de la clase poblacion
     *
     * Este constructor se encarga de crear una nueva población de bacterias con los datos que se le pasan como parámetros.
     *
     * @param nombre Nombre de la población de bacterias
     * @param fechainicio Fecha de inicio de la población de bacterias
     * @param fechafin Fecha de fin de la población de bacterias
     * @param temperatura Temperatura de la población de bacterias
     * @param luz Luminosidad de la población de bacterias
     * @param comida Dosis de comida de la población de bacterias
     * @param nombrepoblacion Nombre de la población de bacterias
     * @param numinicialbacterias Número inicial de bacterias de la población
     * @param experimento Experimento al que pertenece la población de bacterias
     */
    public poblacion(String nombre, Date fechainicio, Date fechafin, double temperatura, luminosidad luz, dosis comida, String nombrepoblacion, int numinicialbacterias, experimento experimento) {
        super(nombre, fechainicio, fechafin, temperatura, luz, comida);
        this.nombrepoblacion = nombrepoblacion;
        this.numinicialbacterias = numinicialbacterias;
        this.experimento = experimento;
    }

    public poblacion(){
        super();
        this.nombrepoblacion = "";
        this.numinicialbacterias = 0;
        this.experimento = new experimento();
    }

    public String getNombre() {  return nombrepoblacion;  }

    public void setNombre(String nombrepoblacion) {  this.nombrepoblacion = nombrepoblacion;  }

    public int getNumInicialBacterias() {  return numinicialbacterias;  }

    public void setNumInicialBacterias(int numinicialbacterias) {  this.numinicialbacterias = numinicialbacterias;  }

    /**
     * Método toString
     *
     * Este método se encarga de devolver una cadena de caracteres con la información de la población de bacterias.
     *
     * @return Cadena de caracteres con la información de la población de bacterias
     */
    @Override
    public String toString() {
        return "\nPOBLACION DE BACTERIAS" +
                "\nNombre de la población: " + nombrepoblacion +
                "\nNúmero inicial de bacterias: " + numinicialbacterias ;
                
    }

    

}
