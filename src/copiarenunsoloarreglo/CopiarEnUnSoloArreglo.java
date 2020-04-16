package copiarenunsoloarreglo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class CopiarEnUnSoloArreglo{
    
    public static void main(String[] args) {


        ArrayList<Integer> lista1 = new ArrayList<Integer> (); //Creamos el objeto "lista1" de la clase "ArrayList" de tipo "Integer"
       
        
            lista1.add(1);
            lista1.add(2);
            lista1.add(5);
            lista1.add(3);
            lista1.add(4);
            lista1.add(5);
            lista1.add(6);

       for (Integer it: lista1){
           System.out.println(it);
       }
 
        ///HashSet sinRepetidos = new HashSet();
        
        Map sinRepetidos = new HashMap();
        
        for (Integer it: lista1){
           sinRepetidos.put(it, "");
       }
        
        
        
        
        
        System.out.println(sinRepetidos);
        

        
       /*for( Iterator it = sinRepetidos.iterator(); it.hasNext();) { 
	    sinRepetidos x = (sinRepetidos)it.next();
	    System.out.println(x.nombre + " : " + x.cantidad);

	}*/
        
    }
}


