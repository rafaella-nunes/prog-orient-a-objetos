package aula11;

public class Tecnico extends Aluno{
    private int registroProfissional;
    
    public void pratica(){
        System.out.println("O aluno " + this.getNome() + " possui pratica profissional.");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}
