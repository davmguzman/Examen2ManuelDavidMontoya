
package com.mycompany.examen2manueldavidmontoya;

import java.util.ArrayList;
import java.util.List;


public class Encuesta {
    private  int contadorEncuestas = 1;
    private static List<String> nombre = new ArrayList<>();
    private static List<Float> edad = new ArrayList<>();
    private static List<String> correo = new ArrayList<>();
    private static List<Integer>numEncuesta= new ArrayList<>();
    private static List<Boolean> carroPropio = new ArrayList<>();
    
    
    
    
    public static int cantidadEncuestas() {
    return nombre.size();
}

public static int cantidadConCarroPropio() {
    int cantidad = 0;
    for (boolean tieneCarroPropio : carroPropio) {
        if (tieneCarroPropio) {
            cantidad++;
        }
    }
    return cantidad;
}
    
    public static void agregarRegistro(String nombre, String correo, float edad, int numEncuesta, boolean tienecarropropio){
        Encuesta.nombre.add(nombre);
        Encuesta.correo.add(correo);
        Encuesta.edad.add(edad);
        Encuesta.numEncuesta.add(numEncuesta);
        Encuesta.carroPropio.add(tienecarropropio);
    }
    
    
    public static List<String> getNombre() {
        return nombre;
    }

    public static void setNombre(List<String> nombre) {
        Encuesta.nombre = nombre;
    }

    public static List<Float> getEdad() {
        return edad;
    }

    public static void setEdad(List<Float> edad) {
        Encuesta.edad = edad;
    }

    public static List<String> getCorreo() {
        return correo;
    }

    public static void setCorreo(List<String> correo) {
        Encuesta.correo = correo;
    }
    
    
    

    
    
    
}
