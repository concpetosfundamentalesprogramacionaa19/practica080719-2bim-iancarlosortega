/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Salas
 */
public class SumaNumeros {
    
    public static int obtenerSumaUno(int a){
        int suma = 0;
        
        for (int i = 1; i <= a; i++) {
            
            suma = suma + i;   
        }
        return suma;
    }
    
    public static int obtenerSumaDos(int a){
        if(a<=0){
            return 0;
        }else{
            return a + obtenerSumaDos(a-1);
        }
    }
    
}
