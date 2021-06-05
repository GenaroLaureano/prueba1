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
        bt.agregar(1);
        bt.agregar(2);
        bt.agregar(3);
        bt.agregar(4);
        bt.agregar(5);
        bt.agregar(6);
        bt.agregar(7);
        bt.agregar(8);
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

}
