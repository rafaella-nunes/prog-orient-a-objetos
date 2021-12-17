package empregado;

public class Empregado extends Pessoa{
    private float salario;
    private String cargo;
    private Endereco local;

    public Empregado(float salario, String cargo, Endereco local, String nome, int idade, String sexo, int id) {
        this.setSalario(salario);
        this.cargo = cargo;
        this.local = local;
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setId(id);
    }

    public Empregado(float salario, String nome, int idade, String sexo, int id) {
        this.setSalario(salario);
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setId(id);
    }
    
    public Empregado(float salario, String cargo, String nome, int idade, String sexo, int id) {
        this.setSalario(salario);
        this.cargo = cargo;
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setId(id);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (this.salario>=0){
            this.salario = salario;
        }
        else{
            System.out.println("Impossivel atualizar salario");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Endereco getLocal() {
        return local;
    }

    public void setLocal(Endereco local) {
        this.local = local;
    }
    
    public void status(){
        System.out.println("Nome do empregado: " + this.getNome() + "\nSalario do empregado: "
        + this.getSalario() + "\nCargo: " + this.getCargo());
    }
    
}
