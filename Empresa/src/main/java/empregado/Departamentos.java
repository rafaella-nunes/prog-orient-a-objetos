package empregado;

import java.util.ArrayList;

public class Departamentos {
    private String nomeDep;
    private String funcaoDep;
    ArrayList <Empregado> Empregados = new ArrayList<>();

    public Departamentos(String nomeDep, String funcaoDep) {
        this.nomeDep = nomeDep;
        this.funcaoDep = funcaoDep;
    }

    public String getNomeDep() {
        return nomeDep;
    }

    public void setNomeDep(String nomeDep) {
        this.nomeDep = nomeDep;
    }

    public String getFuncaoDep() {
        return funcaoDep;
    }

    public void setFuncaoDep(String funcaoDep) {
        this.funcaoDep = funcaoDep;
    }
    
    public void adicionarEmpregado(Empregado novo){
        Empregados.add(novo);
    }
    
    public void removerEmpregado(Empregado remover){
        Empregados.remove(remover);
    }

    public void getEmpregados() {
        for(int i = 0; i < Empregados.size(); i++) {
            System.out.println(Empregados.get(i).getNome());
        }
    }

    public void setEmpregados(ArrayList<Empregado> Empregados) {
        this.Empregados = Empregados;
    }
    
    
    
}
