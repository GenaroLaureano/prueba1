/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laure
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        
       Arbol arbolCreado = arbol.crearArbol();

       
        List<Integer> valor = arbolCreado.recorridoPorAmplitud(arbolCreado.getPrincipal());
        System.out.println(valor);
    }
    
}
