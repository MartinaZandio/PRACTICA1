package practica1;

import java.io.IOException;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {

        int opcionelegida = menu();
        switch(opcionelegida){
            case 1: 
                System.out.println("Opcion 1: Abrir un archivo que contenga un experimento\n");
                break;
            case 2: 
                System.out.println("Opcion 2: Crear un nuevo experimento\n");
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

    public static int menu(){
        int opcion; 
        try{System.out.println(
            "1. Abrir un archivo que contenga un experimento\n" + 
            "2. Crear un nuevo experimento\n" + 
            "3. Crear una población de bacterias y añadirla al experimento actual\n" + 
            "4. Visualizar los nombres de todas las poblaciones de bacterias del experimento\n" + 
            "5. Borrar una población de bacterias del experimento actual\n" + 
            "6. Ver información detallada de una población de bacterias del experimento actual\n" + 
            "7. Guardar\n" + 
            "8. Guardar como");

            System.out.println("Introduzca el número de la acción que desea realizar: ");

            Scanner leer = new Scanner(System.in);
            opcion=leer.nextInt();
            return opcion; 
        }
        catch (IOException e){
            throw new RuntimeException();
        }
        
    }    
    

       
    
}