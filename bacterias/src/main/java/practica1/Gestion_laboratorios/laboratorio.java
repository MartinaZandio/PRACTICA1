package practica1.Gestion_laboratorios;
import practica1.Gestion_poblaciones.luminosidad;
import practica1.Gestion_comidas.dosis;
import practica1.Gestion_poblaciones.poblacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import practica1.Gestion_experimentos.experimento;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase laboratorio
 *
 * Esta clase contiene los atributos y métodos necesarios para gestionar los laboratorios y los experimentos que se realizan en ellos.
 * Es la clase encargada de la entrada y salida de datos y de la interacción con el usuario
 *
 * @author Martina Zandio Lizarraga
 * @version 1.0
 * @since 1.0
 * @see experimento
 * @see dosis
 * @see poblacion
 * @see luminosidad
 */

public class laboratorio extends experimento { //entrada y salida de datos  
    
    public laboratorio() {
        super();
    }
    /**
     * Método toString
     *
     * Este método se encarga de devolver una cadena de caracteres con la información del laboratorio.
     *
     * @return Cadena de caracteres con la información del laboratorio
     */
    @Override
    public String toString() {
        return "Laboratorio: " + super.toString();
    }

    /**
     * Método menu
     *
     * Este método se encarga de mostrar un menú con las opciones disponibles para el usuario y de leer la opción seleccionada.
     *
     * @return Opción seleccionada por el usuario
     */
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

    /**
     * Método crearExperimento
     *
     * Este método se encarga de crear un nuevo experimento con los datos que se le piden al usuario, incluyendo los datos para generar las dosis de comida diarias.
     *
     * @return Nuevo experimento creado
     */
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

    /**
     * Método crearDosis
     *
     * Este método se encarga de crear una nueva dosis de comida con los datos que se le piden al usuario.
     *
     * @return Nueva dosis de comida creada
     */
    public static dosis crearDosis() throws IOException{
        dosis nuevaDosis = new dosis();

        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nIntroduzca la cantidad inicial de comida: ");
            nuevaDosis.setCantidadInicial(Integer.parseInt(leer.readLine()));
            System.out.println("\nIntroduzca la cantidad máxima de comida (siendo el máximo posible 300): ");
            nuevaDosis.setCantidadMaxIncremento(Integer.parseInt(leer.readLine()));
            System.out.println("\nIntroduzca la cantidad final de comida: ");
            nuevaDosis.setCantidadFinal(Integer.parseInt(leer.readLine()));
            System.out.println("\n¿Después de cuantos días la dosis de comida deja de incrementar linealmente?: ");
            nuevaDosis.setUltimoDiaIncremento(Integer.parseInt(leer.readLine()));

            return nuevaDosis;
            
    
        } catch (Exception e) {

            return null;}
    }

    /**
     * Método crearPoblacion
     *
     * Este método se encarga de crear una nueva población de bacterias con los datos que se le piden al usuario.
     *
     * @return Nueva población de bacterias creada
     */
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

    /**
     * Método accederAPoblacion
     *
     * Este método se encarga de pedir al usuario el nombre de la población a la que quiere acceder.
     *
     * @return Nombre de la población a la que quiere acceder
     */
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

    /**
     * Método PedirNombreArchivo
     *
     * Este método se encarga de pedir al usuario el nombre del archivo que quiere abrir.
     *
     * @return Nombre del archivo que quiere abrir
     */
    public static String PedirNombreArchivo() throws IOException{
        String nombreArchivo;
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nIntroduzca el nombre del archivo: ");
            nombreArchivo = leer.readLine();

            return nombreArchivo;
    
        } catch (Exception e) {

            return null;}
    }

    
}
