package empregado;

public class Recepcionista extends Empregado{
    public Recepcionista(Endereco local, 
                         String nome, 
                         int idade, 
                         String sexo, 
                         int id) {
        super(2000f, "Recepcionista", local, nome, idade, sexo, id);
    }
    
    public void pagarAbono(){
        System.out.println("O salario deste mes sera de 2300 reais...");
        System.out.println("Abono pago!");
    }
    
}

