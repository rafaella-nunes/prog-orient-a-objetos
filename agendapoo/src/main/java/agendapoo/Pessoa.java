package agendapoo;

public class Pessoa {
    private String nome;
    private int telefone;
    private String email;
    private int matricula;
    private boolean validar;

    public Pessoa(String nome, int telefone, String email, int matricula) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
        this.validar = false;
    }
    
    public void validarMatricula(int mat){
        if(this.getMatricula() == mat){
            this.setValidar(true);
            System.out.println(" Matricula validada.");
        }
        else{
            System.out.println("Nao foi possivel validar matricula");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean getValidar() {
        return validar;
    }

    public void setValidar(boolean validar) {
        this.validar = validar;
    }
    
    
    
    
}
