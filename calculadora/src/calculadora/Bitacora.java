/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package calculadora;

/**
 *
 * @author Luis Zambra
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Bitacora {
    
   /* private static final String RUTA_BITACORA = "bitacora.txt";
    
    int cadena;
    */
    
    String cadena2="";
    
    public void concatenar (String txt_datos){
    
        cadena2 += txt_datos+" ";
        
    }
    
    public void limpiar (){
    
        cadena2 = "";
    }
    
    
    public void limpiarArchivo() throws IOException {
        FileWriter archivo = new FileWriter("bitacora.txt");
        archivo.close();
    }
    
    public void escribir() throws IOException{
    
        //System.out.println(cadena2);
        
        
        FileWriter archivo = new FileWriter("bitacora.txt",true);
                // Obtener la fecha y hora actual
        LocalDateTime now = LocalDateTime.now();
        
        // Definir el formato de salida deseado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        // Formatear la fecha y hora según el formato
         
        
        archivo.write(cadena2+ " NUEVO... HORA DE LA OPERACION: " +now.format(formatter)+" \n");
        archivo.close();
        
        
    }
    
    
  
    
    
}
