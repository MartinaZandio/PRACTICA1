package practica1.Gestion_poblaciones;
import practica1. Gestion_experimentos.*;
import practica1.Gestion_comidas.*;
import java.util.Date;


public class poblacion extends experimento{
  
    private int numinicialbacterias;

    public poblacion(String nombre, Date fechainicio, Date fechafin, int numinicialbacterias, double temperatura, luminosidad luz, dosis comida) {
        super(nombre, fechainicio, fechafin, temperatura, luz, comida);
        this.numinicialbacterias = numinicialbacterias;
        
    }

    public poblacion(){
        super();
        this.numinicialbacterias = 0;
    }

    public int getNumInicialBacterias() {  return numinicialbacterias;  }

    public void setNumInicialBacterias(int numinicialbacterias) {  this.numinicialbacterias = numinicialbacterias;  }



}
