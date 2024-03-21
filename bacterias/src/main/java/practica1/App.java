package practica1;

import java.io.IOException;

import practica1.Gestion_laboratorios.laboratorio;
import practica1.Gestion_experimentos.experimento;

public class App{

    private static laboratorio experimentoactual = new experimento(nombre, fechainicio, fechafin, temperatura, luz, comida);

    public static void main(String[] args) throws IOException {//esta es la interfaz con el usuario, solo va el switch, los datos no se piden ni se muestran aqui


        int opcionelegida = laboratorio.menu();
        switch(opcionelegida){
            case 1: 
                System.out.println("Opcion 1: Abrir un archivo que contenga un experimento\n");
                break;
            case 2: 
                System.out.println("Opcion 2: Crear un nuevo experimento\n");
                experimentoactual = laboratorio.crearExperimento();
                System.out.println(experimetnoactual.toString());
                break;
            case 3: 
                System.out.println("Opcion 3: Crear una población de bacterias y añadirla al experimento actual\n");
                break;
            case 4: 
                System.out.println("Opcion 4: Visualizar los nombres de todas las poblaciones de bacterias del experimento\n");
                break;
            case 5: 
                System.out.println("Opcion 5: Borrar una población de bacterias del experimento actual\n");
                break;
            case 6: 
                System.out.println("Opcion 6: Ver información detallada de una población de bacterias del experimento actual\n");
                break;
            case 7: 
                System.out.println("Opcion 7: Guardar\n");
                break;
            case 8: 
                System.out.println("Opcion 8: Guardar como\n");
                break;
            default: 
                System.out.println("Opcion no valida");
                break;
        }
        
    }

    
}