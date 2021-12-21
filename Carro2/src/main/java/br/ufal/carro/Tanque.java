package br.ufal.carro;

public class Tanque {

	private int capacidade;
	private int quantidadePresente;

	public Tanque(int capacidade) {
            this.capacidade = capacidade;
            this.quantidadePresente = 0;
	}

	public void abastecer(int quantidade) {
            if((this.quantidadePresente + quantidade) > this.capacidade){
                System.out.println("Nao e possivel abastecer");
            }
            else{
                this.quantidadePresente = quantidade;
            }
	}

	public int usarCombustivel(int quantidade) {
            if(this.quantidadePresente >= quantidade){
                this.quantidadePresente = this.quantidadePresente - quantidade;
                return this.quantidadePresente;
            }
            else{
                int a = this.quantidadePresente;
                this.quantidadePresente = 0;
                return a;
            }
	}

    public int getCapacidade() {
        return capacidade;
    }

    protected void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadePresente() {
        return quantidadePresente;
    }

    public void setQuantidadePresente(int quantidadePresente) {
        this.quantidadePresente = quantidadePresente;
    }
        
        

}