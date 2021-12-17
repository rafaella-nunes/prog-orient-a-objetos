package aula13;

public class Principal {
    public static void main(String[] args) {
        Cachorro luna = new Cachorro();
        
        luna.reagir("Toma comida");
        luna.reagir(6,20);
        luna.reagir(true);
        luna.reagir(4, 8);
    }
}
