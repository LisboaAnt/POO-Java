//PROJETO EM JAVA COM POO 
//DESENVOLVIDO PARA O CURSO DE POO DO SITE https://www.cursoemvideo.com
//Primeira vez usando encapsulamento
package banco;


public class Banco {


    public static void main(String[] args) {

        conta c1 = new conta(1); // Váriavel c1 do tipo conta recebe o objeto conta com o número digitado
        c1.abrirConta("Joao","CP"); //Abre sua conta, não pode abrir se já estiver aberta
        c1.depositar(100); //Deposita somente se a conta estiver aberta
        c1.sacar(30);   //Só saca se tiver dinheiro e tiver a conta aberta
        c1.pagarMensal(); //Unuidade do banco, só é combrada caso tenha suficiênte
        c1.abrirConta("Jose", "CC"); //Abre sua conta, não pode abrir se já estiver aberta
        c1.sacar(200); // Retira se tiver esse quantia no banco
        c1.fecharConta(); //Fecha se não existir nenhum débito ou cédito no banco
        c1.status(); //Mostra Todos os Atributos
        
        
        
    }
    
}
