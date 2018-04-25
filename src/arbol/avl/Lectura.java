
package arbol.avl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Lectura {
    public Lectura(){
    }
            
   public void leerArchivo(){
        String cadena;
        String archivo = "archivo.txt";
        String archivo2 = "archivo2.txt";
        boolean prb = true;
  
        
      try{
           
           FileReader fr = new FileReader(archivo);
           BufferedReader br = new BufferedReader(fr);
           
           FileWriter fw = new FileWriter(archivo2);
           BufferedWriter bw = new BufferedWriter(fw);
           
           
            while((cadena = br.readLine())!=null){  
                for(int i =0 ;i< cadena.length() ;i++){                    
                    char letra = cadena.charAt(i);
                     if((letra == '0')||(letra == '1')||(letra == '2')||(letra == '3')||(letra == '4')||(letra == '5')||(letra == '6')||(letra == '7')||(letra == '8')||(letra == '9')||(letra == '/')||(letra == ' ')){
                       
                         if(letra != '/'){
                           bw.write(letra);
                          
                        }
                        else if(letra == '/'){
                           bw.write("\r\n");
                          
                        } 
                     }
                     else{
                         System.out.print("Profavor ingrese solo numeros y /");
                         prb = false;
                         break;
                     }
                
                }
              
            }
            br.close();
            bw.close();
       }catch(IOException e){System.err.print("error");}   
 
    }
}
