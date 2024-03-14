package practica1.Gestion_poblaciones;
import practica1.Gestion_comidas.*;
import java.util.Date;


public class poblacion extends experimento{

    public static String nombre;
    private Date fechainicio;
    private Date fechafin;   
    private int numinicialbacterias;
    public static double temperatura; 
    private luminosidad luz;
    private dosis comida;

    public poblacion(String nombre, Date fechainicio, Date fechafin, int numinicialbacterias, double temperatura, luminosidad luz, dosis comida) {
        poblacion.nombre = nombre;  //se pone poblacion.nombre porq es static???
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.numinicialbacterias = numinicialbacterias;
        poblacion.temperatura = temperatura;
        this.luz = luz;
        this.comida = comida;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFechainicio() { return fechainicio; }

    public void setFechainicio(Date fechainicio) { this.fechainicio = fechainicio; }

    public Date getFechafin() { return fechafin; }

    public void setFechafin(Date fechafin) { this.fechafin = fechafin; }

    public int getNuminicialbacterias() { return numinicialbacterias; }

    public void setNuminicialbacterias(int numinicialbacterias) { this.numinicialbacterias = numinicialbacterias; }

    public double getTempertura() { return temperatura; }

    public void setTempertura(double tempertura) { this.temperatura = tempertura; }

    public luminosidad getLuz() { return luz; }

    public void setLuz(luminosidad luz) { this.luz = luz; }

    public dosis getComida() { return comida; }

    public void setComida(dosis comida) { this.comida = comida; }


    
}
