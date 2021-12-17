package empregado;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private int cnpj;
    ArrayList <Departamentos> Dep = new ArrayList<>();

    public Empresa(String nome, int cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
    
    
    
    public void novoDep(Departamentos um){
        if(Dep.size()<10){
           Dep.add(um);
        }
    }
    
    public void transfEmpregado(Empregado pessoa, Departamentos velho, Departamentos novo){
        if(velho.Empregados.contains(pessoa)){
            velho.removerEmpregado(pessoa);
            novo.adicionarEmpregado(pessoa);
            System.out.println("Empregado transferido com sucesso!");
    }
        else{
            System.out.println("Nao e possivel transferir funcionario");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Departamentos> getDep() {
        return Dep;
    }

    public void setDep(ArrayList<Departamentos> Dep) {
        this.Dep = Dep;
    }
    
    
}
