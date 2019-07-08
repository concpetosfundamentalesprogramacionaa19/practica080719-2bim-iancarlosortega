/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tamanio;

/**
 *
 * @author Salas
 */
public class Tamanio {
    
    // Metodos para obtener la suma total del arreglo predifinido
    
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2,
                   tamanio - 1 ); 
        } 
    }
    public static int obtenerTamanioArregloDos(int arreglo[],int tamanio){
        int suma = 0;
        for (int i = 0; i < tamanio; i++) {
            suma = suma + arreglo[i];
            
        }
        return suma;
    }
}
