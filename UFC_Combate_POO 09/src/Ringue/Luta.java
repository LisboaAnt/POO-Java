package Ringue;

import java.util.Random;

public class Luta {
    
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(Lutador desafiado, Lutador desafiante) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
    }
    
    
    
    public void marcarLuta(){

        if(desafiado != desafiante && desafiado.getCategoria().equals(desafiante.getCategoria())){
            aprovada = true;
            System.out.println("Luta Marcada!");
        }else{
            System.out.println("Erro ao marcar a Luta!!");
        }
    }

    
    public void lutar(){

        
        if(aprovada){
            System.out.println("====UFC====");
            desafiado.apresentar();
            desafiante.apresentar();
            
            System.out.println("====LUTA====");
            
            //Gera um número que vai definir quem vai
            Random rand = new Random();
            int numAleatorio = rand.nextInt(3) + 1;
            
            if (numAleatorio == 0){
                desafiado.ganharLuta();
                desafiante.perderLuta();
                rounds = (int)((Math.random() * 4) + 1);
                System.out.println("Em uma luta com "+(int)((Math.random() * 4) + 1)+" Rounds o vencedor foi " + desafiado.getNome()+"!!");
                
            }else if(numAleatorio == 1){
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                rounds = (int)((Math.random() * 4) + 1);
                System.out.println("Em uma luta com "+rounds+" Rounds o resultado foi empate!!");
                
            }else{
                desafiado.perderLuta();
                desafiante.ganharLuta();
                rounds = (int)((Math.random() * 4) + 1);
                System.out.println("Em uma luta com "+(int)((Math.random() * 4) + 1)+" Rounds o vencedor foi " + desafiante.getNome()+"!!");
            }
            
        }else{
            System.out.println("Luta não pode acontecer!");
        }
    }
    
}
