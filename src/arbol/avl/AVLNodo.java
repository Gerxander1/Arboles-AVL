
package arbol.avl;


public class AVLNodo {
  
    public Comparable dato;      	
    public AVLNodo izquierdo;            
    public AVLNodo derecho;              
    public int height;                 

    // Constructors
    public AVLNodo( Comparable dato ){
        this( dato, null, null );
    }

    public AVLNodo( Comparable dato, AVLNodo izq, AVLNodo der ){
        this.dato = dato;
        this.izquierdo = izq;
        this.derecho = der;
        height   = 0;              
    }

}
