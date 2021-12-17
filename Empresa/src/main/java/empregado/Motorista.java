package empregado;

public class Motorista extends Empregado{
    
    public Motorista(Endereco local, String nome, int idade, String sexo, int id) {
        super(2030.0f, "Motorista", local, nome, idade, sexo, id);
    }
    
    public void pagarAbono(){
        System.out.println("O salario deste mes sera de 2320 reais...");
        System.out.println("Abono pago!");
    }

}
