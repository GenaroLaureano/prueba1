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
public class Arbol {

    private Node principal;

    private Node agregarRecursivo(Node actual, int valor) {
        if (actual == null) {
            return new Node(valor);
        }

        if (valor < actual.getValor()) {
            actual.setIzquierdo(agregarRecursivo(actual.getIzquierdo(), valor));
        } else if (valor > actual.getValor()) {
            actual.setDerecho(agregarRecursivo(actual.getDerecho(), valor));
        } else {
            return actual;
        }

        return actual;
    }

    public void agregar(int valor) {
        principal = agregarRecursivo(principal, valor);
    }

    public Arbol crearArbol() {
        Arbol bt = new Arbol();
        bt.agregar(4);
        bt.agregar(5);
        bt.agregar(3);
        bt.agregar(2);
        bt.agregar(7);
        bt.agregar(6);
        bt.agregar(8);
        bt.agregar(1);
        return bt;
    }

    public int profundidad(Node root) {
        if (root == null) {
            return 0;
        }
        int nLeft = profundidad(root.getIzquierdo());
        int nRight = profundidad(root.getDerecho());
        return (nLeft > nRight) ? (nLeft + 1) : (nRight + 1);
    }

    public Node getPrincipal() {
        return principal;
    }

    public void setPrincipal(Node principal) {
        this.principal = principal;
    }

    
    private int obtenerNivel(Node actual, int valor) {
        if (valor == actual.getValor()) {
            return 1;
        }
        return valor < actual.getValor() ?  1 + obtenerNivel(actual.getIzquierdo(), valor) : 1 + obtenerNivel(actual.getDerecho(), valor);
    }
    

    public List<Integer> obtenerVecinos(int valor){
        int nivel = obtenerNivel(principal, valor);
        return obtenerNodosVecinos(principal,nivel,valor);
    }
    
    public List<Node> recorrerPorNiveles(Node arbol){
        List<Node> cola = new ArrayList<>();
        List<Node> aux = new ArrayList<>();
        cola.add(arbol);
        
        while(!cola.isEmpty()){
            Node actual = cola.get(0);
            cola.remove(0);
            aux.add(actual);
            if(actual!=null){
                cola.add(actual.getIzquierdo());                
                cola.add(actual.getDerecho());
            }
             
        }
        
        
//        int[] valores = obtenerRangoValores(nivel);
//        aux = aux.subList(valores[0], valores[1]);
//        
//        List<Integer> filaNodos = new ArrayList<>();        
//        for(int i=0; i<aux.size(); i++){
//            if(aux.get(i)!=null){
//                if(aux.get(i).getValor()!=valor){
//                    filaNodos.add(aux.get(i).getValor());
//                }
//            }
//        }
       
        return aux;
            
    }
    
    public List<Integer> obtenerNodosVecinos(Node principal, int nivel, int valor){
        
        List<Node> aux = recorrerPorNiveles(principal);
        
          int[] valores = obtenerRangoValores(nivel);
        aux = aux.subList(valores[0], valores[1]);
        
        List<Integer> filaNodos = new ArrayList<>();        
        for(int i=0; i<aux.size(); i++){
            if(aux.get(i)!=null){
                if(aux.get(i).getValor()!=valor){
                    filaNodos.add(aux.get(i).getValor());
                }
            }
        }
       
        return filaNodos;
    }
    
    
    
    public int[] obtenerRangoValores(int nivel){
        int a = 0;
        int b = 1;
        for(int i=0; i<nivel; i++){
            if(i!=0){
                a += (int)Math.pow(2, (i-1));
                b += (int)Math.pow(2, (i));
            }
        }
        int[] valores = {a,b};
        return valores;
    }
    
    
    public List<Integer> recorridoPorAmplitud(Node arbol){
        
        List<Node> aux = recorrerPorNiveles(principal);

        List<Integer> filaNodos = new ArrayList<>();        
        for(int i=0; i<aux.size(); i++){
            if(aux.get(i)!=null){
                filaNodos.add(aux.get(i).getValor());
            }
        }
       
        return filaNodos;
        
    }
    
    
    
    

}
