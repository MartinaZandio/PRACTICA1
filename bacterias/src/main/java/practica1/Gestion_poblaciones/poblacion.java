import Gestion_comidas.dosis;
import java.util.Date;
  

public class poblacion {

    private String nombre;
    private Date fechainicio;
    private Date fechafin;   
    private int numinicialbacterias;
    private double tempertura; 
    private luminosidad luz;
                // private comida cmo hacer q dosis no m de error 
    private dosis comida;

    public poblacion(String nombre, Date fechainicio, Date fechafin, int numinicialbacterias, double tempertura, luminosidad luz, dosis comida) {
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.numinicialbacterias = numinicialbacterias;
        this.tempertura = tempertura;
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

    public double getTempertura() { return tempertura; }

    public void setTempertura(double tempertura) { this.tempertura = tempertura; }

    public luminosidad getLuz() { return luz; }

    public void setLuz(luminosidad luz) { this.luz = luz; }

    public dosis getComida() { return comida; }

    public void setComida(dosis comida) { this.comida = comida; }


    
}
