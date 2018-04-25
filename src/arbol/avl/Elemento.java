
package arbol.avl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Elemento {

        public void elementos(){
        int elemento[] = new int[15]; 
        String archivo = "archivo2.txt";
        String cadena;
        int i=0;
        
        Lectura a = new Lectura();
        a.leerArchivo();
   
        AVLTree arbolAVL = new AVLTree();
        
        
    try{
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
            while((cadena = br.readLine())!=null){
                elemento[i] = Integer.parseInt(cadena);
                                        i++;
            }
            br.close();
            
            Integer elemento1 = new Integer(elemento[0]);
            Integer elemento2 = new Integer(elemento[1]);
            Integer elemento3 = new Integer(elemento[2]);
            Integer elemento4 = new Integer(elemento[3]);
            Integer elemento5 = new Integer(elemento[4]);
            Integer elemento6 = new Integer(elemento[5]);
            Integer elemento7 = new Integer(elemento[6]);
            Integer elemento8 = new Integer(elemento[7]);
            Integer elemento9 = new Integer(elemento[8]);
            Integer elemento10 = new Integer(elemento[9]);
            Integer elemento11 = new Integer (elemento[10]);
            Integer elemento12 = new Integer (elemento[11]);
            Integer elemento13 = new Integer (elemento[12]);
            Integer elemento14 = new Integer (elemento[13]);
            Integer elemento15 = new Integer (elemento[14]);

            
            arbolAVL.insert(elemento1);
            arbolAVL.insert(elemento2);
            arbolAVL.insert(elemento3);
            arbolAVL.insert(elemento4);
            arbolAVL.insert(elemento5);
            arbolAVL.insert(elemento6);
            arbolAVL.insert(elemento7);
            arbolAVL.insert(elemento8);
            arbolAVL.insert(elemento9);
            arbolAVL.insert(elemento10);
            arbolAVL.insert(elemento11);
            arbolAVL.insert(elemento12);
            arbolAVL.insert(elemento13);
            arbolAVL.insert(elemento14);
            arbolAVL.insert(elemento15);
            arbolAVL.imprimirPorNiveles();
            System.out.println("\n");
       
    }catch(IOException e){}
            
        }
}
