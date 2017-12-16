
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IvanRosalesMartinez92
 */
public class HashNodos {
    Aristas DISPERSO = new Aristas();
    
    HashMap<Integer, Aristas> DD = new HashMap<>();
    
    public void setHash(Aristas  Disp){//poner
        HashMap<Integer, Aristas> D = new HashMap<>();
      int h;
                        h = D.size();
                        
                      if (h==0){
                      D.put(0, Disp);
                      h = h+1;
                          System.out.println("el hash "+h);
                      }  
        
                         D.put(h, Disp);
                         h = h+1; 
                    

       
        DD = D;
    }
    
    public HashMap<Integer, Aristas>  getHash(){//traer
    return DD;
    }
    
    
}
