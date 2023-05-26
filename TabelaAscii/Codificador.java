/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criptagemurss;

public class Codificador {
    
    public String codificar(String x){
        String retorna = "";
        
        char listChar[] = new char[x.length()];
        listChar = x.toCharArray();
        
        for(char xx : listChar){
            retorna += (char) (xx+3); //Tabela ascii
        }
        return retorna;
    }

    public String descodificar(String x){
        String retorna = "";
        char listChar[] = new char[x.length()];
        listChar = x.toCharArray();
        
        for(char xx : listChar){
            retorna += (char) (xx-3);
        }
        return retorna;
    }
}
