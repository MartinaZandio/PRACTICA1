package practica1.Gestion_laboratorios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class laboratorio { //entrada y salida de datos  
    
    public static int menu() throws IOException{
        int opcion; 
        try{
            System.out.println(
            "1. Abrir un archivo que contenga un experimento\n" + 
            "2. Crear un nuevo experimento\n" + 
            "3. Crear una población de bacterias y añadirla al experimento actual\n" + 
            "4. Visualizar los nombres de todas las poblaciones de bacterias del experimento\n" + 
            "5. Borrar una población de bacterias del experimento actual\n" + 
            "6. Ver información detallada de una población de bacterias del experimento actual\n" + 
            "7. Guardar\n" + 
            "8. Guardar como");

            System.out.println("Introduzca el número de la acción que desea realizar: ");
            
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            opcion = Integer.parseInt(leer.readLine());
            return opcion; 
        }
        catch (IOException e){
            throw new RuntimeException();
        }
        
    }    

}
