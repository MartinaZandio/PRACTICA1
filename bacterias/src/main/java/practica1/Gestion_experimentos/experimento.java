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

public class experimento {   //clase padre de pobalcion (poblacion hereda atributos de esta clase para que esten relacionadas)

    private String nombre;
    private Date fechainicio;
    private Date fechafin; // 30 dias después de la de inicio
    private double temperatura;
    private luminosidad luz;
    private dosis comida;
    public ArrayList<poblacion> poblacionestotales = new ArrayList<>();

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

    @Override
public String toString() {
    return "experimento{" +
            "nombre='" + nombre + '\'' +
            ", fechainicio=" + fechainicio +
            ", fechafin=" + fechafin +
            ", temperatura=" + temperatura +
            ", luz=" + luz +
            ", comida=" + comida +
            ", poblacionestotales=" + poblacionestotales +
            '}';
}

    public void añadirDosis(dosis nuevadosis){
        this.comida = nuevadosis;
    }

    public ArrayList<poblacion> getPoblacionestotales() {
        return poblacionestotales;
    }

    public void setPoblacionestotales(ArrayList<poblacion> poblacionestotales) {
        this.poblacionestotales = poblacionestotales;
    }

    public void anadirPoblacion(poblacion nuevapoblacion){
        poblacionestotales.add(nuevapoblacion);
    }

    public void visualizarPoblaciones(){
        for(int i = 0; i < poblacionestotales.size(); i++){
            System.out.println(poblacionestotales.get(i).getNombre());
        }
    }

    
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

    public void infoDetallada(String nombrepoblacioninfo){
        for (poblacion poblacion : poblacionestotales){
            if (poblacion.getNombre().equals(nombrepoblacioninfo)){
                System.out.println(poblacion.toString());
            }
        }
    }

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

    /* try {
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

    return null;  */

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



    

