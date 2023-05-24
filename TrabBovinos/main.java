package fazendinha_feliz;

public class main {
    public static void main(String[] args) {

    Fazenda fa1 = new Fazenda("Fazenda1"); //Cria um objeto fazenda
    fa1.gerarGadoAleatorio(200);//gera x gados, 20% de chance de ser Vaca Parida
    
    Fazenda fa2 = new Fazenda("Fazenda2");
    Carreta car1 = new Carreta();
    car1.transporteGado(fa1, fa2);
    fa2.printList(); //printa todos os gados
    
    
    }
}
