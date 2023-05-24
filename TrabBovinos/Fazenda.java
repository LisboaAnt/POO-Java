/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fazendinha_feliz;

import java.util.Random;

public class Fazenda {
    //Atributos
    private String nomeFazenda;
    private Bovino []listaBovina; 

    //Contructors
    public Fazenda(){}
    public Fazenda(String nomeFazenda){
        this.nomeFazenda = nomeFazenda;
    }
   
   
   //Gera gados
   public void gerarGadoAleatorio(int x){ //Metodo que gera x gados
        Random random = new Random(); //Usamos o Random para numeros aleatorios
        int min = 160; //de 160
        int max = 500; //até 500 de peso
        
        this.listaBovina = new Bovino[x]; //Gera x gados
        for(int i=0;i <= x-1;i++){
            int RandVPeso = random.nextInt(max - min + 1) + min; //numero aleatorio peso
            boolean RandVParida = random.nextDouble() <= 0.2; //20% de Vaca Parida ser True
            
            this.listaBovina[i] = new Bovino(i,RandVPeso,RandVParida); //gera os objetos Bovinos e põe na lista
        }
   }
   
   //Transportar gados

   
   //getters e setters
    public String getNomeFazenda() {
        return nomeFazenda;
    }

    public Bovino[] getListaBovina() {
        return listaBovina;
    }

    public void setNomeFazenda(String nomeFazenda) {
        this.nomeFazenda = nomeFazenda;
    }

    public void setListaBovina(Bovino[] listaBovina) {
        this.listaBovina = listaBovina;
    }
   
    
    
   
   
   //Percorre a lista e printa os gados
   public void printList(){
       if(this.listaBovina[0] != null){
            for(Bovino a : this.listaBovina){
                System.out.println(a.toString());
            }
        }
    }
   
}

