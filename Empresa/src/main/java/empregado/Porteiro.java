package empregado;

public class Porteiro extends Empregado{
    public Porteiro(Endereco local, 
            String nome, 
            int idade, 
            String sexo, 
            int id) {
        super(2050.0f, "Porteiro", local, nome, idade, sexo, id);
    }
    public void pagarAbono(){
        System.out.println("O salario deste mes sera de 2350 reais...");
        System.out.println("Abono pago!");
    }

    
}
