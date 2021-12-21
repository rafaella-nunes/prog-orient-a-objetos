package br.ufal.carro;

public class PrincipalCarro {
    public static void main(String[] args) {
        Motor h1 = new MotorFlex();
        Carro celta = new Carro("Celta", "Preto", h1);
        Motor h2 = new MotorDiesel();
        Carro caminhonete = new Carro("Caminhonete", "Azul", h2);
        
        
        celta.acelerar(40);
        System.out.println("--------");
        celta.ligar();
        celta.acelerar(30);
        System.out.println("------");
        celta.abastecer(50);
        celta.ligar();
        celta.acelerar(10);
        System.out.println("-------------");
        
        
        caminhonete.acelerar(20);
        System.out.println("-------");
        caminhonete.abastecer(60);
        caminhonete.ligar();
        caminhonete.acelerar(10);
    }
    
}
