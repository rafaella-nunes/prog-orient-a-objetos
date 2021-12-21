package br.ufal.carro;

public class Carro {

	private String modelo;
	private String cor;
	private int velocidade;
	private Tanque tanque;
	private IMotor motor;

    public Carro(String modelo, String cor, IMotor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.velocidade = 0;
        this.tanque = new Tanque(100);
    }
        
    
	public void ligar() {
            this.motor.ligar();
	}

	public void desligar() {
            if(this.getVelocidade()>0){
                this.freiar();
            }
            this.motor.desligar();
	}

	public void acelerar(int quantCombustivel) {
            if(this.motor.isLigado()){
                if(this.tanque.getQuantidadePresente() == 0){
                System.out.println("Nao e possivel acelerar, carro sem combustivel.");
                this.motor.desligar();
                }
                else if(this.tanque.getQuantidadePresente()>= quantCombustivel){
                    this.motor.acelerar(this, quantCombustivel);
                    this.tanque.usarCombustivel(quantCombustivel);
                    System.out.println("Acelerando com " + quantCombustivel + " unidades de combustivel");
                    System.out.println("A velocidade do carro e: " + this.velocidade);

                    if (this.tanque.getQuantidadePresente() == 0){
                        this.desligar();
                    }
                }
                else{
                    this.motor.acelerar(this, this.tanque.getQuantidadePresente());
                    this.tanque.usarCombustivel(this.tanque.getQuantidadePresente());
                    System.out.println("Acelerando com " + quantCombustivel + " unidades de combustivel");
                    System.out.println("A velocidade do carro e: " + this.velocidade);
                    if (this.tanque.getQuantidadePresente() == 0){
                        this.desligar();
                    }
                }
            }
            else{
                System.out.println("Impossivel acelerar, carro desligado.");
            }
	}

	public void freiar() {
            this.setVelocidade(0);
	}

        protected void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }

	public int getVelocidade() {
            return this.velocidade;
	}
        
        public void abastecer(int quantidade){
            this.tanque.abastecer(quantidade);
        }

}