/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula011;

/**
 *
 * @author anton
 */
public final class Tecnico extends Aluno{
    private int registroProfissional;
    
    //M�todos
    public void praticar(){
        System.out.println("O tecnico "+this.getNome()+" est� praticando");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    
}
