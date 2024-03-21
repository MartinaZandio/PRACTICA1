package practica1.Gestion_laboratorios;
import practica1.Gestion_poblaciones.luminosidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import practica1.Gestion_experimentos.experimento;
import java.text.SimpleDateFormat;
import java.util.Date;

public class laboratorio extends experimento { //entrada y salida de datos  
    
    public laboratorio() {
        super();
    }
   
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
    
    public static experimento crearExperimento() throws IOException{
        experimento nuevoExperimento = new experimento();

        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nIntroduzca el nombre del experimento: ");
            nuevoExperimento.setNombre(leer.readLine());
            System.out.println("\nIntroduzca la temperatura en celsius a la que se realiza el experimento: ");
            nuevoExperimento.setTemperatura(Double.parseDouble(leer.readLine()));
            System.out.println("\nIntroduzca el dia en el que comineza el experimento (formato dd/MM/yyyy): ");
            String fechaintroducida = leer.readLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaInicio = dateFormat.parse(fechaintroducida);
            nuevoExperimento.setFechainicio(fechaInicio);
            System.out.println("\nIntroduzca la luminosidad del experimento (alta = a, media = m, baja = b): ");
            int aux = leer.read();
            if (aux == 'a'){
                nuevoExperimento.setLuz(luminosidad.alta);
            }
            else if (aux == 'm'){
                nuevoExperimento.setLuz(luminosidad.media);
            }
            else if (aux == 'b'){
                nuevoExperimento.setLuz(luminosidad.baja);
            }
            else{
                System.out.println("Error, introduzca una luminosidad válida");
            }
            System.out.println("\nIntroduzca la cantidad de comida inical: ");
            nuevoExperimento.getComida().setCantidadInicial(Integer.parseInt(leer.readLine()));

            return nuevoExperimento;
            
    
        } catch (Exception e) {
            // TODO: handle exception
        }
        


    }

    public static poblacion crearPoblacion() throws IOException{
        


    }
        

}
