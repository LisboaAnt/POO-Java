

package aula011;


public class Aluno extends Pessoa {
        private int matricula;
    private String curso;
    
    //M�todos
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do Aluno "+ this.getNome());
    }
    
    //m�todos especiais

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
