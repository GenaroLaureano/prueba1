/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

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
       
       int valor = arbol.profundidad(arbolCreado.getPrincipal());
        System.out.println(valor);
    }
    
}
