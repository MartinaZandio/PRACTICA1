package practica1.Gestion_comidas;
import java.util.Date;

public class dosis {
    
    private int cantidadinicial; //cantidad del primer dai 
    private Date ultimodiaincremento;  //ultimo dia en el q la dosis de comida aumenta linealmente 
    private int cantidadincremento;  //cantidad de comida en el ultimo dia de incremento de dosis 
    private int cantidadfinal;   //cantidad que ha sido repartida al final 

    public dosis(int cantidadinicial, Date ultimodiaincremento, int cantidadincremento, int cantidadfinal) {
        this.cantidadinicial = cantidadinicial;
        this.ultimodiaincremento = ultimodiaincremento; 
        this.cantidadincremento = cantidadincremento;
        this.cantidadfinal = cantidadfinal;
    }

    public int getCantidadInicial() {  return cantidadinicial; }

    public void setCantidadInicial(int cantidadinicial) { this.cantidadinicial = cantidadinicial; }

    public Date getUltimoDiaIncremento() {  return ultimodiaincremento;  }

    public void setUltimoDiaIncremento(Date ultimodiaincremento) {  this.ultimodiaincremento = ultimodiaincremento; }

    public int getCantidadIncremento() {  return cantidadincremento;  }

    public void setCantidadIncremento(int cantidadincremento) {  this.cantidadincremento = cantidadincremento; }

    public int getCantidadFinal() {  return cantidadfinal;   }

    public void setCantidadFinal(int cantidadfinal) {  this.cantidadfinal = cantidadfinal;  }
}

    





