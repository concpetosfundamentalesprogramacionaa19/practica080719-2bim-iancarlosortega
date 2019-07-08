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
public class Principal {
    
    public static void main(String[] args) {
        
        /*
            Clase principal para ejecutar los metodos y guardar las variables que
            retornan
        */
        
        int arreglo[] = {10, 20, 30, 1, 2, 3, 40, 4};
        int suma = Tamanio.obtenerTamanioArreglo(arreglo, 8);
        int suma2 = Tamanio.obtenerTamanioArregloDos(arreglo, 8);
        System.out.printf("Suma = %d\nSuma2 = %d",suma,suma2);
    }
    
}
