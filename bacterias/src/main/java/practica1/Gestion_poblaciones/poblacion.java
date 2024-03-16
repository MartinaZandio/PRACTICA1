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


    public int getNuminicialbacterias() { return numinicialbacterias; }

    public void setNuminicialbacterias(int numinicialbacterias) { this.numinicialbacterias = numinicialbacterias; }

@Override
public String toString() {
    return "Poblacion [nombre=" + getNombre() + ", fechainicio=" + getFechainicio() + ", fechafin=" + getFechafin()
            + ", numinicialbacterias=" + numinicialbacterias + ", temperatura=" + getTemperatura() + ", luz=" + getLuz()
            + ", comida=" + getComida() + "]";
}

}
