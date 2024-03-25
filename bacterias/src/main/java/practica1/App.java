package practica1;

import java.io.IOException;
import java.io.Serializable;


import practica1.Gestion_laboratorios.laboratorio;
import practica1.Gestion_comidas.dosis;
//import practica1.Gestion_comidas.reparticion_comida;
import practica1.Gestion_experimentos.experimento;
import practica1.Gestion_poblaciones.poblacion;


public class App implements Serializable{

    private static experimento experimentoactual = new experimento();
    private static poblacion nuevapoblacion = new poblacion();
    private static dosis dosis = new dosis();
    
    public static void main(String[] args) throws IOException {//esta es la interfaz con el usuario, solo va el switch, los datos no se piden ni se muestran aqui

        int opcionelegida;
        do{
        opcionelegida = laboratorio.menu();
        switch(opcionelegida){
            case 1: 
                System.out.println("Opción 1: Abrir un archivo que contenga un experimento\n");
                String archivoaabrir = laboratorio.PedirNombreArchivo();
                experimentoactual = experimento.abrirArchivo(archivoaabrir);
                break;
            case 2: 
                System.out.println("Opción 2: Crear un nuevo experimento\n");
                experimentoactual = laboratorio.crearExperimento();
                System.out.println("Experimento creado: " +experimentoactual.toString());
                break;
            case 3: 
                System.out.println("Opción 3: Crear una población de bacterias y añadirla al experimento actual\n");
                nuevapoblacion = laboratorio.crearPoblacion();
                experimentoactual.anadirPoblacion(nuevapoblacion);
                break;
            case 4: 
                System.out.println("Opción 4: Visualizar los nombres de todas las poblaciones de bacterias del experimento\n");
                experimentoactual.visualizarPoblaciones();
                break;
            case 5: 
                System.out.println("Opción 5: Borrar una población de bacterias del experimento actual\n");
                String nombrepoblacionaborrar = laboratorio.accederAPoblacion();
                experimentoactual.eliminarPoblacion(nombrepoblacionaborrar);
                break;
            case 6: 
                System.out.println("Opción 6: Ver información detallada de una población de bacterias del experimento actual\n");
                String nombrepoblacioninfo = laboratorio.accederAPoblacion();
                experimentoactual.infoDetallada(nombrepoblacioninfo);

                dosis.reparticion(experimentoactual.getComida().getCantidadInicial(), experimentoactual.getComida().getCantidadMaxIncremento(), experimentoactual.getComida().getCantidadFinal(), experimentoactual.getComida().getUltimoDiaIncremento());
                
                //dosis.reparticion(nuevapoblacion.getComida().getCantidadInicial(), nuevapoblacion.getComida().getCantidadMaxIncremento(), nuevapoblacion.getComida().getCantidadFinal(), nuevapoblacion.getComida().getUltimoDiaIncremento());
                
                //dosis.reparticion(opcionelegida, opcionelegida, opcionelegida, opcionelegida);
                //System.out.println("Datos de la dosis de comida: " + nuevapoblacion.getComida().toString());

                break;
            case 7: 
                System.out.println("Opción 7: Guardar\n");
                experimento.guardar(experimentoactual);
                break;
            case 8: 
                System.out.println("Opción 8: Guardar como\n");
                String nombrearchivo = laboratorio.PedirNombreArchivo();
                experimento.guardarComo(experimentoactual, nombrearchivo);
                break;
            default: 
                System.out.println("Opción no valida");
                break;
        }
        
    }while(opcionelegida != 0);

    }

    
}