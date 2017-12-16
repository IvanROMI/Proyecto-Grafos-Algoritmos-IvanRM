
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IvanRosalesMartinez92
 */
public class ARBOL_DFS {
    private Nodos D = new Nodos();
    private Nodos help1 = new Nodos();
    private HashMap<Integer, Nodos> help2 = new HashMap<>();
    
    private Nodos help3 = new Nodos();
    private int v;
   private String Vec;
   private int vec; 
   private int ayuda;
   
   
   public HashMap<Integer, Aristas> DD = new HashMap<>();
   
    
    public void setDFS(Nodos  Arbol , HashMap<Integer, Nodos> Tnodos, HashMap<Integer, Aristas> holi){//poner
        
        
       //int key_D = 0;
        help1 = Arbol; 
      int r = 0;
        help1.setVisit(true);//***********Aqui se marcan como visitados
        ArrayList<String> Tonta = new ArrayList<String>();
       
                 Tonta = help1.getVecino();
                 v = Tonta.size();
        
                for(int i=0; i<v; i++){
                          
                          Vec = Tonta.get(i);
                          vec = Integer.parseInt(Vec);//convierto en numero entero esto sera el nombre de un nodo
                          
                         
                          help2 = Tnodos;
                          
                          help3 = help2.get(vec);//aqui saco el objeto del nodo vecino
                          //System.out.println("el nodo es "+help3.getId());
                          if (help3.getVisit()==false ){
                          Aristas tree = new Aristas();
                          tree.setStart(help1.getId());
                          tree.setEnd(help3.getId());
                          //System.out.println(tree.getStart()+"--"+tree.getEnd());
                          
         
                            //r = holi.hashCode()+1;
                            //System.out.println("h vale" + r);  
                            holi.put(holi.hashCode(), tree);
                            //HashD.put(h,tree );
                            //key_D = key_D+1;
                            //h =h+1;
                              System.out.println("el hash tiene "+holi.size());
                           
                         Arbol = help3; 
                         ARBOL_DFS Recursar = new ARBOL_DFS();
                         Recursar.setDFS(Arbol,help2,holi);
                
                           
                          }
                 }
               DD = holi; 
    }
   
    public HashMap<Integer, Aristas> getDFS(){//traer
         
    return DD;
       
    }
    
}
