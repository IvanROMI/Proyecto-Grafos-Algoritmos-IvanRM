
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IvanRosalesMartinez92
 */
public class Nodos {
    
 private int Id;
private int x;
private int y;
private String help;
private boolean visitado;
private int Bool;
private int Dijstra;
private int padre;
private  int DAD;
private  int conjunto;
private  int HIJO;


   
    public void setId(int Nid){//poner
        Id = Nid;
    }
    
    public int getId(){//traer
    return Id;
    }

     public void setX(int X){//poner
        x = X;
    }
    
    public int getX(){//traer
    return x;
    }
   public void setY(int Y){//poner
        y = Y;
    }
    
    public int getY(){//traer
    return y;
    }
    
      ArrayList<String> Vecinos = new ArrayList<String>();
      
     public void setVecino(String cadena){//poner 
        help = cadena;
       
        Vecinos.add(help);
    }
     
     public ArrayList getVecino(){//poner 
       
     return Vecinos;
    }

     public void setVisit(boolean visitar){//poner 
        visitado = visitar;
       
    }
     
     public boolean getVisit(){//poner 
       
     return visitado;
    }
     
     public void setBool(int uno){//poner 
        Bool = uno;
       
    }
     
     public int getBool(){//poner 
       
     return Bool;
    }
     
     public void setDijstra(int Dij){//poner 
        Dijstra = Dij;
       
    }
     
     public int getDijstra(){//poner 
       
     return Dijstra;
     }
     
     
     
     public void setPadre(int papi ){//poner
        padre = papi;
        
        
    }
    
    public int  getPadre(){//traer
    return padre;
    }
    
   ArrayList<Integer> Padres = new ArrayList<Integer>();
     
     public void setDAD(int dadi ){//poner
        DAD = dadi;
        
        Padres.add(padre);
    }
    
    public ArrayList<Integer> getDAD(){//traer
    return Padres;
    }
    
    
    public void setConjunto(int cj ){//poner
        conjunto = cj;
        
        
    }
    
    public int  getConjunto(){//traer
    return conjunto;
    }

 public void setHijo(int son ){//poner
        HIJO = son;
        
        
    }
    
    public int  getHijo(){//traer
    return HIJO;
    }
    
}


