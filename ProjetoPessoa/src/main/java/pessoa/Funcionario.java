package pessoa;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void mudarSetor(String novosetor){
        this.setSetor(novosetor);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
