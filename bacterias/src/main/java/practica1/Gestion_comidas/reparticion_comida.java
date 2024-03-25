/*package practica1.Gestion_comidas;

public class reparticion_comida extends dosis{

    public reparticion_comida(int cantidadinicial, int cantidadmaxincremento, int cantidadfinal, int ultimodiaincremento) {
        super(cantidadinicial, cantidadmaxincremento, cantidadfinal, ultimodiaincremento);
    }

    public static int reparticion(int cantidadinicial, int cantidadmaxincremento, int cantidadfinal, int ultimodiaincremento){
        int cantidad = 0; 
            for (int i=0; i<=30; i++){
            if (i<=ultimodiaincremento){
                cantidad = cantidadinicial + (cantidadmaxincremento - cantidadinicial) * i / ultimodiaincremento;
            }
            else{
                cantidad = cantidadmaxincremento - (cantidadmaxincremento - cantidadfinal) * (i - ultimodiaincremento) / (30 - ultimodiaincremento);
            }
            System.out.println("Dia " + i + ": " + cantidad + " gramos de comida");
        }

        return cantidad;

    }


}
*/