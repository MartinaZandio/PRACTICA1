package practica1.Gestion_comidas;

public class dosis {
    private int cantidad;
    private int incremento;
    private int decremento; //despues de 15 dias 
    private int cantidaddecremento; //cantidad de comida una vez llegado el dia en el q empieza el decremnto

    public dosis(int cantidad, int incremento, int decremento, int cantidaddecremento) {
        this.cantidad = cantidad;
        this.incremento = incremento;
        this.decremento = decremento;
        this.cantidaddecremento = cantidaddecremento;
    }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad;  }

    public int getIncremento() {  return incremento; }

    public void setIncremento(int incremento) {  this.incremento = incremento; }

    public int getDecremento() {  return decremento; }

    public void setDecremento(int decremento) {  this.decremento = decremento;  }

    public int getCantidadDecremento() {  return cantidaddecremento; }

    public void setCantidadDecremento(int cantidaddecremento) {  this.cantidaddecremento = cantidaddecremento; }
}




