
package arbol.avl;

import java.util.Scanner;


public class ArbolAvl {

   
    public static void main(String[] args) {
      String opc;
      Scanner teclado = new Scanner(System.in);  
      
        System.out.println("Intucciones.......");
        System.out.println("Ingrese a archivo.txt");
        System.out.println("Escriba 15 numeros diferentes sin repetir ni uno y separedos por /");
        System.out.println("Ingrese en la barra de herrameitas en archivo luego prosiga a Guardar.");
        System.out.println("Cuando termine Prosiga a ingresar Y si desea prosegir y ver en la pantalla el arbol avl....");
        System.out.println("\nIngrese Y ");
        opc = teclado.next();
        
      if(opc.equals("Y")){
      
      Elemento a = new Elemento();
      a.elementos();
      }
    }
    
}
