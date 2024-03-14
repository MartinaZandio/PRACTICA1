package practica1.Gestion_experimentos;

import practica1.Gestion_poblaciones.*;
import java.util.ArrayList;
import java.util.Date;

public class experimento {   //para asociar atributos de poblacion con exprimetno pongo por ejemplo nombre = nombre.poblacion

    private String nombre;
    private Date fechainicio;
    private Date fechafin; // 30 dias después de la de inicio
    private double temperatura;
    ArrayList<poblacion> poblacionestotales = new ArrayList<>();

    public experimento(String nombre, Date fechainicio, Date fechafin, double temperatura){
        this.nombre = poblacion.nombre;
        this.fechainicio = new Date();
        this.fechafin = new Date(fechainicio.getTime() + 30 * 24 * 60 * 60 * 1000);
        this.temperatura = poblacion.temperatura;
    }

    public String getNombre() { return nombre;  }

    public void setNombre(String nombre) {  this.nombre = nombre;  }

    public Date getFechainicio() {  return fechainicio; }

    public void setFechainicio(Date fechainicio) {  this.fechainicio = fechainicio;  }

    public Date getFechafin() {  return fechafin;  }

    public void setFechafin(Date fechafin) {  this.fechafin = fechafin;  }

    public double getTemperatura() {  return temperatura;  }

    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }
}

    

