//PROJETO EM JAVA COM POO 
//DESENVOLVIDO PARA O CURSO DE POO DO SITE https://www.cursoemvideo.com
//Primeira vez usando encapsulamento
package banco;


public class Banco {


    public static void main(String[] args) {

        conta c1 = new conta(1); // V�riavel c1 do tipo conta recebe o objeto conta com o n�mero digitado
        c1.abrirConta("Joao","CP"); //Abre sua conta, n�o pode abrir se j� estiver aberta
        c1.depositar(100); //Deposita somente se a conta estiver aberta
        c1.sacar(30);   //S� saca se tiver dinheiro e tiver a conta aberta
        c1.pagarMensal(); //Unuidade do banco, s� � combrada caso tenha sufici�nte
        c1.abrirConta("Jose", "CC"); //Abre sua conta, n�o pode abrir se j� estiver aberta
        c1.sacar(200); // Retira se tiver esse quantia no banco
        c1.fecharConta(); //Fecha se n�o existir nenhum d�bito ou c�dito no banco
        c1.status(); //Mostra Todos os Atributos
        
        
        
    }
    
}
