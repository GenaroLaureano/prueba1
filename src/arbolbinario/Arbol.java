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
public class Arbol {
    
    private NodeAux arbol;
    
    public Arbol(NodeAux arbol){
        this.arbol = arbol;
    }
    
    public int profundidad(NodeAux arbol){
        if(arbol!=null){
            if(arbol.getNodoDerecho()==null && arbol.getNodoIzquierdo()==null){
                return 1;
            }else if(arbol.getNodoDerecho()!=null){
                return 1 + profundidad(arbol.getNodoDerecho());
            }else if(arbol.getNodoIzquierdo()!=null){
                return 1 + profundidad(arbol.getNodoIzquierdo());
            }
        }
        
        return 0;
    }
    
    
}
