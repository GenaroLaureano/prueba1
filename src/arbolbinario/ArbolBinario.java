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
        NodeAux nodo2 = new NodeAux(2);
        nodo2.setNodoDerecho(new NodeAux(4));
        NodeAux nodo5 = new NodeAux(5);
        nodo5.setNodoDerecho(new NodeAux(8));
        nodo2.setNodoIzquierdo(nodo5);
        
        NodeAux nodo3 = new NodeAux(3);
        nodo2.setNodoDerecho(new NodeAux(7));
        nodo2.setNodoIzquierdo(new NodeAux(6));
        
        NodeAux nodo = new NodeAux(1);
        nodo.setNodoDerecho(nodo3);
        nodo.setNodoIzquierdo(nodo2);
        
        Arbol arbol = new Arbol(nodo);
        
        int res = arbol.profundidad(nodo);
        System.out.println("res:"+res);
        
    }
    
}
