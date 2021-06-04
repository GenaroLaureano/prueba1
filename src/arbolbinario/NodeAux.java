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
public class NodeAux extends Node{
    
    
    private NodeAux nodoDerecho;
    private NodeAux nodoIzquierdo;
    
    public NodeAux(int valor){
        super(valor);
    }

    public NodeAux getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(NodeAux nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }

    public NodeAux getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(NodeAux nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }
    
    
    
    
    
    
}
