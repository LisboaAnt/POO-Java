/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fazendinha_feliz;

public class Carreta {
    private Bovino listBov[];
    private int QuantCarreta = 0;
    
    public void transporteGado(Fazenda fa1,Fazenda fa2){
        Bovino AuxlistBov[] = fa1.getListaBovina();//passa a lista
        int quantList =AuxlistBov.length; 
        int i = 0;
        

        while(quantList != 0){
            this.QuantCarreta++;
            int quant = 0;
                 //Quantidade 
                float pesos = 0;
                float TempMedia = 0;
                boolean teste = true;
                int ii = 0;
                do{
                    quant++;
                    quantList--;
                    //Calcular a media 
                    pesos += AuxlistBov[i].getPeso();
                    ++i;
                    ++ii;
                    TempMedia = pesos/ii;
                    if(quantList == 0){teste = false;}

                }while(teste&&(
                           (160 <= TempMedia && TempMedia < 200 && quant <40)
                        || (200 <= TempMedia && TempMedia < 250 && quant <35)
                        || (250 <= TempMedia && TempMedia < 300 && quant <30)
                        || (300 <= TempMedia && TempMedia < 360 && quant <25)
                        || (360 <= TempMedia && TempMedia < 400 && quant <20)
                        || (400 <= TempMedia && TempMedia < 460 && quant <18)
                        || (460 <= TempMedia && TempMedia <= 500 && quant <16)
                        ));
                
        
            System.out.println("Viagem: "+ this.QuantCarreta+" Peso: "+pesos);
        }
        System.out.println("Carretas necessarias: "+this.QuantCarreta);
    //Quantas carretas s�o necessarias?
    //Passar de uma lista para outra
    //Print numero de carretas necessarias
    
    fa2.setListaBovina(fa1.getListaBovina());
    Bovino lll[] = new Bovino[50];
    fa1.setListaBovina(lll);
        System.out.println("Numero do peso total");
    }
    
}
