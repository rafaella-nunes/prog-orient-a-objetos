package empregado;

import java.util.ArrayList;

public class Registrar{
    ArrayList <Empregado> Empregados = new ArrayList<>();
    
    public void novoEmpregado(Empregado novo){
        Empregados.add(novo);
        System.out.println("Empregado cadastrado no sistema!");
    }
    
    public void demitirEmpregado(Empregado demitir){
        Empregados.remove(demitir);
        System.out.println("Empregado demitido.");
    }
    
    public void imprimirEmpregados(){
        for(int i = 0; i < Empregados.size(); i++){
            System.out.println(Empregados.get(i).getNome() + ", Salario: " + Empregados.get(i).getSalario());
        }
    }
}
