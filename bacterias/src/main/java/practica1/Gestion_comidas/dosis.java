package practica1.Gestion_comidas;
import java.util.Date;

public class dosis {
    
    private int cantidadinicial; //cantidad del primer dia 
    private int cantidadmaxincremento;  //cantidad de comida en el ultimo dia de incremento de dosis 
    private int cantidadfinal;   //cantidad que ha sido repartida al final 
    private Date ultimodiaincremento;  //ultimo dia en el q la dosis de comida aumenta linealmente 

    public dosis(int cantidadinicial, Date ultimodiaincremento, int cantidadmaxincremento, int cantidadfinal) {
        this.cantidadinicial = cantidadinicial;
        this.ultimodiaincremento = ultimodiaincremento; 
        this.cantidadmaxincremento = cantidadmaxincremento;
        this.cantidadfinal = cantidadfinal;
    }

    public int getCantidadInicial() {  return cantidadinicial; }

    public void setCantidadInicial(int cantidadinicial) { this.cantidadinicial = cantidadinicial; }

    public Date getUltimoDiaIncremento() {  return ultimodiaincremento;  }

    public void setUltimoDiaIncremento(Date ultimodiaincremento) {  this.ultimodiaincremento = ultimodiaincremento; }

    public int getCantidadMaxIncremento() {  return cantidadmaxincremento;  }

    public void setCantidadMaxIncremento(int cantidadincremento) {  this.cantidadmaxincremento = cantidadmaxincremento; }

    public int getCantidadFinal() {  return cantidadfinal;   }

    public void setCantidadFinal(int cantidadfinal) {  this.cantidadfinal = cantidadfinal;  }
}

    





