package br.ufal.carro;

public class MotorDiesel implements IMotor {
    boolean ligado;
    int aceleracao;
    
    @Override
	public void acelerar(Carro c, int quantCombustivel) {
            this.setAceleracao(quantCombustivel * 750);
            c.setVelocidade(Math.round(this.getAceleracao()/110));
	}

    @Override
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public boolean isLigado() {
        return this.ligado;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }
    
}