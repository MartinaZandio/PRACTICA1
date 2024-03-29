package practica1.Gestion_experimentos;

import practica1.Gestion_comidas.dosis;
import practica1.Gestion_poblaciones.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;

/**
 * Clase experimento
 *
 * Esta clase contiene los atributos y métodos necesarios para gestionar los experimentos que se realizan en el laboratorio.
 *
 * @author Martina Zandio Lizarraga
 * @version 1.0
 * @since 1.0
 * @see Serializable
 * @see java.io.Serializable
 * @see java.io
 * @see java.io.IOException
 */

public class experimento implements Serializable{   //clase padre de poblacion (poblacion hereda atributos de esta clase para que esten relacionadas)

    private String nombre;
    private Date fechainicio;
    private Date fechafin; // 30 dias después de la de inicio
    private double temperatura;
    private luminosidad luz;
    private dosis comida;
    public ArrayList<poblacion> poblacionestotales = new ArrayList<>();

    /**
     * Constructor de la clase experimento
     *
     * Este constructor se encarga de crear un nuevo experimento con los datos que se le pasan como parámetros.
     *
     * @param nombre Nombre del experimento
     * @param fechainicio Fecha de inicio del experimento
     * @param fechafin Fecha de fin del experimento
     * @param temperatura Temperatura a la que se realiza el experimento
     * @param luz Luminosidad a la que se realiza el experimento
     * @param comida Dosis de comida que se le da a las bacterias en el experimento
     */

    public experimento(String nombre, Date fechainicio, Date fechafin, double temperatura, luminosidad luz, dosis comida){
        this.nombre = nombre;
        this.fechainicio = new Date();
        this.fechafin = new Date(fechainicio.getTime() + 30 * 24 * 60 * 60 * 1000);
        this.temperatura = temperatura;
        this.luz = luz;
        this.comida = comida; 
    }

    public experimento() {
        this.nombre = "";
        this.fechainicio = new Date();
        this.fechafin = new Date(fechainicio.getTime() + 30 * 24 * 60 * 60 * 1000);
        this.temperatura = 0;
        this.luz = null;
        this.comida = null;
    }

    public String getNombre() { return nombre;  }

    public void setNombre(String nombre) {  this.nombre = nombre;  }

    public Date getFechainicio() {  return fechainicio; }

    public void setFechainicio(Date fechainicio) {  this.fechainicio = fechainicio;  }

    public Date getFechafin() {  return fechafin;  }

    public void setFechafin(Date fechafin) {  this.fechafin = fechafin;  }

    public double getTemperatura() {  return temperatura;  }

    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }

    public luminosidad getLuz() {  return luz;  }

    public void setLuz(luminosidad luz) {  this.luz = luz;  }

    public dosis getComida() {  return comida;  }

    public void setComida(dosis comida) {  this.comida = comida;  }


    /**
     * Método toString
     *
     * Este método se encarga de devolver una cadena de texto con los datos del experimento.
     *
     * @return String Cadena de texto con los datos del experimento
     */
    @Override
public String toString() {
    return "Experimento:" +
            "\n El nombre del experimento es: " + nombre +
            "\n El experimento comienza el dia: " + fechainicio +
            "\n El experimento finaliza el dia: " + fechafin + "(30 días después de la fecha de inicio)" +
            "\n La temperatura a la que se realiza el experimento es de " + temperatura + "grados celsius" +
            "\n El experimento se realiza con una luminosidad " + luz +
            "\n La dosis de comida para este experimento es: " + comida + "\n" 
            ;
}

    /**
     * Método añadirDosis
     *
     * Este método se encarga de añadir una nueva dosis de comida al experimento.
     *
     * @param nuevadosis Nueva dosis de comida, de tipo dosis, a añadir al experimento actual
     */
    public void añadirDosis(dosis nuevadosis){
        this.comida = nuevadosis;
    }
    public ArrayList<poblacion> getPoblacionestotales() {
        return poblacionestotales;
    }

    public void setPoblacionestotales(ArrayList<poblacion> poblacionestotales) {
        this.poblacionestotales = poblacionestotales;
    }
    /**
     * Método añadirPoblacion
     *
     * Este método se encarga de añadir una nueva población de bacterias al arrayList de poblaciones que forman un experimento.
     *
     * @param nuevapoblacion Nueva población de bacterias, de tipo poblacion, a añadir al experimento actual
     */
    public void anadirPoblacion(poblacion nuevapoblacion){
        poblacionestotales.add(nuevapoblacion);
    }
    /**
     * Método visualizarPoblaciones
     *
     * Este método se encarga de mostrar por pantalla los nombres de todas las poblaciones de bacterias que forman un experimento.
     */
    public void visualizarPoblaciones(){
        for(int i = 0; i < poblacionestotales.size(); i++){
            System.out.println(poblacionestotales.get(i).getNombre());
        }
    }

    /**
     * Método eliminarPoblacion
     *
     * Este método se encarga de eliminar una población de bacterias del arrayList de poblaciones que forman un experimento.
     *
     * @param nombrepoblacionaborrar Nombre de la población de bacterias, pedido al usuario, a eliminar del experimento actual
     */
    public void eliminarPoblacion(String nombrepoblacionaborrar){
        poblacion poblacionaeliminar = null; 
        for (poblacion poblacion : poblacionestotales){
            if (poblacion.getNombre().equals(nombrepoblacionaborrar)){
                poblacionaeliminar = poblacion; 
                break;
            }
        }
        if (poblacionaeliminar != null){
            poblacionestotales.remove(poblacionaeliminar);
        }
       
    }

    /**
     * Método infoDetallada
     *
     * Este método se encarga de mostrar por pantalla la información detallada de una población de bacterias del experimento actual, incluyendo los detalles del experimento y la dosis de comida de cada día.
     *
     * @param nombrepoblacioninfo Nombre de la población de bacterias, pedido al usuario, de la que se quiere mostrar la información detallada
     */
    public void infoDetallada(String nombrepoblacioninfo){
        for (poblacion poblacion : poblacionestotales){
            if (poblacion.getNombre().equals(nombrepoblacioninfo)){
                System.out.println(poblacion.toString());
                System.out.println("Datos del experimento: " + this.toString());
            }
        }
    }
    /**
     * Método abrirArchivo
     *
     * Este método se encarga de abrir un archivo que contiene un experimento guardado previamente.
     *
     * @param archivoaabrir Nombre del archivo, pedido al usuario, que contiene el experimento a abrir
     * @return experimento Experimento que se ha cargado desde el archivo
     * @throws IOException Excepción que se lanza si ocurre un error al abrir el archivo
     */
    public static experimento abrirArchivo(String archivoaabrir) throws IOException{
        experimento exp = null; 
        try {
            FileInputStream fis = new FileInputStream(archivoaabrir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            exp = (experimento) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Experimento cargado desde: " + archivoaabrir);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada al leer el objeto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir el archivo.");
            e.printStackTrace();
        }
         return exp;
    }

    /**
     * Método guardar
     *
     * Este método se encarga de guardar un experimento en un archivo.
     *
     * @param experimentoactual Experimento que se quiere guardar en el archivo
     * @throws IOException Excepción que se lanza si ocurre un error al guardar el experimento en el archivo
     */
    public static void guardar (experimento experimentoactual) throws IOException{
        try {
            File archivo = new File ("experimento.txt");
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(experimentoactual);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al guardar el exprimento en el archivo ");
            e.printStackTrace();
        }
    }

    /**
     * Método guardarComo
     *
     * Este método se encarga de guardar un experimento en un archivo con un nombre determinado por el usuario.
     *
     * @param experimentoactual Experimento que se quiere guardar en el archivo
     * @param nombrearchivo Nombre del archivo en el que se quiere guardar el experimento
     * @throws IOException Excepción que se lanza si ocurre un error al guardar el experimento en el archivo
     */
    public static void guardarComo(experimento experimentoactual, String nombrearchivo) throws IOException{
        try {
            File archivo = new File(nombrearchivo);
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(experimentoactual);
            oos.close();
            fos.close();
            System.out.println("El experimento se ha guardado como: " + nombrearchivo);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al guardar como.");
            e.printStackTrace();
        }

    }
    
}



    

