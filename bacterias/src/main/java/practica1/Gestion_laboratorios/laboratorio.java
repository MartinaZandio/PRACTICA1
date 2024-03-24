package practica1.Gestion_laboratorios;
import practica1.Gestion_poblaciones.luminosidad;
import practica1.Gestion_comidas.dosis;
import practica1.Gestion_poblaciones.poblacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import practica1.Gestion_experimentos.experimento;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class laboratorio extends experimento { //entrada y salida de datos  
    
    public laboratorio() {
        super();
    }

    @Override
    public String toString() {
        return "Laboratorio: " + super.toString();
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
            char aux = leer.readLine().charAt(0);
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

            dosis dosis = crearDosis();
            nuevoExperimento.añadirDosis(dosis);
           
            return nuevoExperimento;
            
    
        } catch (Exception e) {
            return null;
        }
    }

    public static dosis crearDosis() throws IOException{
        dosis nuevaDosis = new dosis();

        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nIntroduzca la cantidad inicial de comida: ");
            nuevaDosis.setCantidadInicial(Integer.parseInt(leer.readLine()));
            System.out.println("\nIntroduzca la cantidad máxima de comida: ");
            nuevaDosis.setCantidadMaxIncremento(Integer.parseInt(leer.readLine()));
            System.out.println("\nIntroduzca la cantidad final de comida: ");
            nuevaDosis.setCantidadFinal(Integer.parseInt(leer.readLine()));
            System.out.println("\nIntroduzca el último día en el que la dosis de comida aumenta linealmente (formato dd/MM/yyyy): ");
            String fechaintroducida = leer.readLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaIncremento = dateFormat.parse(fechaintroducida);
            nuevaDosis.setUltimoDiaIncremento(fechaIncremento);

            return nuevaDosis;
            
    
        } catch (Exception e) {

            return null;}
    }

    public static poblacion crearPoblacion() throws IOException{
        poblacion nuevaPoblacion = new poblacion();

        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nIntroduzca el nombre de la población: ");
            nuevaPoblacion.setNombre(leer.readLine());
            System.out.println("\nIntroduzca el numero de bacterias que forman la poblacion:");
            nuevaPoblacion.setNumInicialBacterias(Integer.parseInt(leer.readLine()));

            return nuevaPoblacion;
            
    
        } catch (Exception e) {

            return null;}
    }

    public static String accederAPoblacion() throws IOException{
        String nombrePoblacion;
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nIntroduzca el nombre de la población que desea eliminar o visualizar, dependiendo de la opción seleccionada anteriormente: ");
            nombrePoblacion = leer.readLine();
            return nombrePoblacion;
            
    
        } catch (Exception e) {

            return null;}
    }

    public static experimento abrirArchivo(){
        try {
            File miExperimento = new File("experimento.txt");
            if(miExperimento.createNewFile()){
                System.out.println("Archivo nuevo creado: " + miExperimento.getName());
            }else{
                System.out.println("Ese archivo ya existe");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }

        return null;
        
    }

    /*public static void guardarEnArchivo(experimento experimentoactual){
        try {
            FileWriter archivoguardado = new FileWriter("experimento.txt");
            archivoguardado.write("EXPERIMENTO GUARDADO");
            archivoguardado.close();
      
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }   */

    public static void guardar (experimento experimentoactual){
        try {
            File archivo = new File ("experimento.txt");
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(experimentoactual);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }

    public static void guardarComo(experimento experimentoactual){


    }
}
