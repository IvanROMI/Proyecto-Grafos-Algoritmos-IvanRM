/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IvanRosalesMartinez92
 */
public class Aristas {
   private int S;
    private int E;
    private int Name;
    private int fat;
    

    private String valor;
    
    public void setValor(String Svalor){
        valor = Svalor;
    }
    
    public String getValor(){
        return valor;
    }
    
    public void setStart(int Start ){//poner
        S = Start;
    }
    
    public int getStart(){//traer
    return S;
    }
    
    public void setEnd(int End ){//poner
        E = End;
    }
    
    public int getEnd(){//traer
    return E;
    }
    
     public void setName(int Nombre ){//poner
        Name = Nombre;
    }
    
    public int getName(){//traer
    return Name;
    }
    
    public void setPeso(int gordo ){//poner
        fat = gordo;
    }
    
    public int getPeso(){//traer
    return fat;
    }
    
    
}
