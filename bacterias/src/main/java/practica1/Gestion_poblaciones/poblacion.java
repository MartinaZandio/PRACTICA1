package practica1.Gestion_poblaciones;
import practica1. Gestion_experimentos.*;
import practica1.Gestion_comidas.*;
import java.util.Date;
import java.io.Serializable;


public class poblacion extends experimento implements Serializable{
  
    private String nombrepoblacion;
    private int numinicialbacterias;
    private experimento experimento;



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

    @Override
    public String toString() {
        return "\nPOBLACION DE BACTERIAS" +
                "\nNombre de la población: " + nombrepoblacion +
                "\nNúmero inicial de bacterias: " + numinicialbacterias ;
                
    }

    

}
