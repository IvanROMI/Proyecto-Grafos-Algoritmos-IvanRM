/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IvanRosalesMartinez92
 */
public class ARBOL_BFS {
    private int E;
    private int S;
    private int nombre;
    
    public void setName(int nom){//poner
        nombre = nom;
    }
    
    public int getName(){//traer
    return nombre;
    }
    
    
    public void setEntra(int empieza ){//poner
        E = empieza;
    }
    
    public int getEntra(){//traer
    return E;
    }
    
    public void setSale(int termina ){//poner
        S = termina;
    }
    
    public int getSale(){//traer
    return S;
    }
    
    
    
}
