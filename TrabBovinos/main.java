package fazendinha_feliz;

public class main {
    public static void main(String[] args) {

    Fazenda fa1 = new Fazenda("Fazenda1"); //Cria um objeto fazenda
    fa1.gerarGadoAleatorio(50);//gera x gados, 20% de chance de ser Vaca Parida
    
    
    Fazenda fa2 = new Fazenda("Fazenda2");//Cria outa fazenda
    Carreta car1 = new Carreta(); //Cria um objeto carreta
    car1.transporteGado(fa1, fa2); //Transporta os gados da Fazenda 1 para a fazenda 2
    fa1.printList(); //printa todos os gados
    
    
    }
}
