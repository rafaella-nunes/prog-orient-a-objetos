package br.ufal.carro;

public class MotorDiesel extends Motor {

        @Override
	public void acelerar(Carro c, int quantCombustivel) {
            this.setAceleracao(quantCombustivel * 750);
            c.setVelocidade(Math.round(this.getAceleracao()/110));
	}

}