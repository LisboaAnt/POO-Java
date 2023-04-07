//Poo utilizando conceitos de Herança, encapsulamento e Polimorfismo
//Todas as "Folhas" foram bloqueadas para não terem filhos
//

package aula011;


public class Aula011 {



    public static void main(String[] args) {
    //Main her  
    
    System.out.println("========Visitante========");
    Visitante v1 = new Visitante();
    v1.setNome("Juvenal");
    v1.setIdade(12);
    v1.setSexo("M");
    System.out.println(v1.toString());
    
    System.out.println("========Aluno========");
    
    Aluno a1 = new Aluno();
    a1.setNome("Maria");
    a1.setMatricula(1111);
    a1.setIdade(19);
    a1.setCurso("Matematica");
    a1.setSexo("F");
    a1.pagarMensalidade();
    
    System.out.println("========Bolsista========");
    
    Bolsista b1 = new Bolsista();
    b1.setNome("João");
    b1.setMatricula(2222);
    b1.setCurso("CC");
    b1.setSexo("M");
    b1.setBolsa(15f);
    b1.pagarMensalidade();
    b1.renovarBolsa();
    
    System.out.println("========Professor========");
    
    Professor p1 = new Professor();
    p1.setNome("Sr. Marcos");
    p1.setIdade(30);
    p1.setEspecialidade("Professor de POO");
    p1.setSalario(4000);
    p1.setSexo("M");
    p1.receberAumento(900);
    }
}
