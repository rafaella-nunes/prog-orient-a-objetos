package conta;

public class Conta {
    public static void main(String[] args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(127688);
        p1.abrirConta("cc");
        p1.setDono("Jubileu da Silva");
        p1.estadoAtual();
        
        p1.depositar(300f);
        
        ContaBanco p2 = new ContaBanco();
        p2.setDono("Creuza Maria");
        p2.setNumConta(98544);
        p2.abrirConta("cp");
        p2.estadoAtual();
        
        p2.depositar(500);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        p2.sacar(100f);
        p2.estadoAtual();
    }
    
}
