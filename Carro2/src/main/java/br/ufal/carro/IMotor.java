package br.ufal.carro;

public interface IMotor {
    public abstract void ligar();
    public abstract void desligar();
    public abstract boolean isLigado();
    public abstract void acelerar(Carro c, int quantCombustivel);
    
    
}
